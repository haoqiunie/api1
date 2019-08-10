package com.mht.service.impl;

import com.mht.entity.OrderPayType;
import com.mht.mapper.OrderPayTypeMapper;
import com.mht.service.IOrderPayTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付方式 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class OrderPayTypeServiceImpl extends ServiceImpl<OrderPayTypeMapper, OrderPayType> implements IOrderPayTypeService {

}
