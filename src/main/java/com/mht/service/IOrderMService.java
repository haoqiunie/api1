package com.mht.service;

import com.mht.entity.OrderM;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
public interface IOrderMService extends IService<OrderM> {


    List<OrderM> getByOrderId(Integer orderId);

}
