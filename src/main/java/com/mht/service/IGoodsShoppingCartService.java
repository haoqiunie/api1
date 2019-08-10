package com.mht.service;

import com.mht.entity.GoodsShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mht.entity.User;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 购物车 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
public interface IGoodsShoppingCartService extends IService<GoodsShoppingCart> {

    /**
     * 根据用户id获取用户购物车总数
     * @param userId 用户id
     * @return totalNum
     */
    Integer getTotalNum(Integer userId);


    /**
     * 根据用户id获取购物车列表
     * @param userId 用户id
     * @return 用户购物车列表
     */
    List<GoodsShoppingCart> getList(Integer userId);


    /**
     * 添加购物车
     * @param str 包含商品规格id和数量的json字符串
     * @param user 用户信息
     * @return map
     */
    Map<String, Object> save(String str, User user);

}
