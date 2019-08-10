package com.mht.service.impl;

import com.mht.entity.OrderUpdateRecord;
import com.mht.mapper.OrderUpdateRecordMapper;
import com.mht.service.IOrderUpdateRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单修改信息记录表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class OrderUpdateRecordServiceImpl extends ServiceImpl<OrderUpdateRecordMapper, OrderUpdateRecord> implements IOrderUpdateRecordService {

}
