package com.mht.service;

import com.mht.entity.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品订单表 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
public interface IUserOrderService extends IService<UserOrder> {


    boolean existAfterSalesOrder(Integer orderId);

}
