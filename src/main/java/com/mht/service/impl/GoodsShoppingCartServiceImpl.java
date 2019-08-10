package com.mht.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mht.CommonUtil;
import com.mht.entity.Goods;
import com.mht.entity.GoodsShoppingCart;
import com.mht.entity.GoodsSpecificationM;
import com.mht.entity.GoodsSubject;
import com.mht.entity.User;
import com.mht.mapper.GoodsMapper;
import com.mht.mapper.GoodsShoppingCartMapper;
import com.mht.mapper.GoodsSpecificationMMapper;
import com.mht.mapper.GoodsSubjectMapper;
import com.mht.mapper.OrderFreightTemplateMapper;
import com.mht.service.IGoodsShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mht.wrapper.QWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 购物车 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class GoodsShoppingCartServiceImpl extends ServiceImpl<GoodsShoppingCartMapper, GoodsShoppingCart> implements IGoodsShoppingCartService {

    @Autowired
    private GoodsShoppingCartMapper goodsShoppingCartMapper;
    @Autowired
    private GoodsSubjectMapper goodsSubjectMapper;
    @Autowired
    private GoodsSpecificationMMapper goodsSpecificationMMapper;
    @Autowired
    private OrderFreightTemplateMapper orderFreightTemplateMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 根据用户id获取用户购物车总数
     * @param userId 用户id
     * @return totalNum
     */
    @Override
    public Integer getTotalNum(Integer userId) {

        QWrapper<GoodsShoppingCart> qWrapper = new QWrapper<>();
        qWrapper.eq(GoodsShoppingCart.COLUMN_USER_ID, userId);
        Integer integer = goodsShoppingCartMapper.selectCount(qWrapper);
        return integer;
    }

    /**
     * 根据用户id获取购物车列表
     * @param userId 用户id
     * @return 用户购物车列表
     */
    @Override
    public List<GoodsShoppingCart> getList(Integer userId) {
        QWrapper<GoodsShoppingCart> qWrapper = new QWrapper<>();
        qWrapper.eq(GoodsShoppingCart.COLUMN_USER_ID,userId);
        List<GoodsShoppingCart> goodsShoppingCarts = goodsShoppingCartMapper.selectList(qWrapper);
        return goodsShoppingCarts;
    }

    /**
     * 添加购物车
     * @param str 包含商品规格id和数量的json字符串
     * @param user 用户信息
     * @return map
     */
    @Override
    public Map<String, Object> save(String str, User user) {
        Map<String, Object> msgMap = new HashMap<>();

        JSONArray jsonArray = JSONArray.parseArray(str);
        GoodsSubject specificationSubject = null;
        if (!CollectionUtils.isEmpty(jsonArray)) {
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            Integer specificationId = jsonObject.getInteger("id");
            specificationSubject = getGoodsSubject(specificationId);
        }

        Integer totalNum = getTotalNum(user.getId());

        if (jsonArray != null && jsonArray.size() + totalNum > 200) {
            msgMap.put("error","购物车数量不能大于200");
        }

        List<GoodsShoppingCart> list = getList(user.getId());

        String ids = CommonUtil.setListToString(jsonArray, "id");
        GoodsSpecificationM goodsSpecification = getGoodsSpecification(ids, specificationSubject);

        //判断活动是否已开始
        if(specificationSubject.getStartTime().getTime() > new Date().getTime()){
            msgMap.put("error", "未到活动开始时间");
            return msgMap;
        }


        return msgMap;
    }

    /**
     * 根据商品规格id获得商品专题信息
     * @param specificationId 品规格id
     * @return 商品专题信息
     */
    private GoodsSubject getGoodsSubject(Integer specificationId) {
        GoodsSpecificationM goodsSpecificationM = goodsSpecificationMMapper.selectById(specificationId);
        Goods goods = goodsMapper.selectById(goodsSpecificationM.getGoodsId());
        GoodsSubject goodsSubject = goodsSubjectMapper.selectById(goods.getSubjectId());
        return goodsSubject;
    }

    /**
     * 根据 商品规格 ids 和 商品专题信息 获得商品规格信息
     * @param ids 商品规格ids
     * @param goodsSubject 商品专题信息
     * @return 商品规格集合
     */
    private GoodsSpecificationM getGoodsSpecification(String ids, GoodsSubject goodsSubject) {
        return null;
    }


}
