package com.mht.service.impl;

import com.mht.entity.OrderVirtualUser;
import com.mht.mapper.OrderVirtualUserMapper;
import com.mht.service.IOrderVirtualUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单虚拟用户 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class OrderVirtualUserServiceImpl extends ServiceImpl<OrderVirtualUserMapper, OrderVirtualUser> implements IOrderVirtualUserService {

}
