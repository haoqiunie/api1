package com.mht.service.impl;

import com.mht.entity.OrderM;
import com.mht.mapper.OrderMMapper;
import com.mht.service.IOrderMService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mht.wrapper.QWrapper;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class OrderMServiceImpl extends ServiceImpl<OrderMMapper, OrderM> implements IOrderMService {

    @Autowired
    private OrderMMapper orderMMapper;

    @Override
    public List<OrderM> getByOrderId(Integer orderId) {
        QWrapper<OrderM> qWrapper = new QWrapper<>();
        qWrapper.eq(OrderM.COLUMN_ORDER_ID,orderId);
        return orderMMapper.selectList(qWrapper);
    }
}
