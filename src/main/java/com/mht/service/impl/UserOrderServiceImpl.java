package com.mht.service.impl;

import com.mht.entity.UserOrder;
import com.mht.mapper.UserOrderMapper;
import com.mht.service.IUserOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mht.wrapper.QWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

/**
 * <p>
 * 商品订单表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class UserOrderServiceImpl extends ServiceImpl<UserOrderMapper, UserOrder> implements IUserOrderService {

    @Autowired
    private UserOrderMapper userOrderMapper;



    @Override
    public boolean existAfterSalesOrder(Integer orderId) {
        Integer count = getCount(orderId);
        return (count != null && count >0) ? true : false;
    }


    private Integer getCount(Integer orderId) {

        QWrapper<UserOrder> qWrapper = new QWrapper<>();

        qWrapper.eq(UserOrder.COLUMN_P_ID,orderId);
        qWrapper.isNotNull(UserOrder.COLUMN_AUDIT_STATUS);
        qWrapper.ne(UserOrder.COLUMN_AUDIT_STATUS,5);
        qWrapper.eq(UserOrder.COLUMN_IS_DELETE,0);

        Integer integer = userOrderMapper.selectCount(qWrapper);
        return integer;
    }
}
