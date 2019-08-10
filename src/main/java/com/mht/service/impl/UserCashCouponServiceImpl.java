package com.mht.service.impl;

import com.mht.entity.UserCashCoupon;
import com.mht.mapper.UserCashCouponMapper;
import com.mht.service.IUserCashCouponService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 现金券流水表,包含两类,1-商品现金券,2-物流现金券 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class UserCashCouponServiceImpl extends ServiceImpl<UserCashCouponMapper, UserCashCoupon> implements IUserCashCouponService {

}
