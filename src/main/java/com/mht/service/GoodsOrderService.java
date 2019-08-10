package com.mht.service;

import java.util.Map;

/**
 * @program: api
 * @description: 商品订单业务
 * @author: 张逸峰
 * @create: 2019-08-06 11:53
 **/
public interface GoodsOrderService {

    Map<String, Object> applyRefund(Map<String, Object> map,Integer refundNum);
}
