package com.mht.service.impl;

import com.mht.entity.Goods;
import com.mht.entity.GoodsSpecificationM;
import com.mht.entity.GoodsSubject;
import com.mht.mapper.GoodsMapper;
import com.mht.mapper.GoodsSpecificationMMapper;
import com.mht.mapper.GoodsSubjectMapper;
import com.mht.service.IGoodsSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mht.wrapper.QWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品专题表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class GoodsSubjectServiceImpl extends ServiceImpl<GoodsSubjectMapper, GoodsSubject> implements IGoodsSubjectService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsSpecificationMMapper goodsSpecificationMMapper;
    @Autowired
    private GoodsSubjectMapper goodsSubjectMapper;


    @Override
    public GoodsSubject getGoodsSubjectBySpecification(Integer specificationId) {
        GoodsSpecificationM goodsSpecificationM = goodsSpecificationMMapper.selectById(specificationId);
        if (goodsSpecificationM == null){
            return null;
        }
        Goods goods = goodsMapper.selectById(goodsSpecificationM.getGoodsId());
        if (goods == null){
            return  null;
        }
        return goodsSubjectMapper.selectById(goods.getSubjectId());
    }
}
