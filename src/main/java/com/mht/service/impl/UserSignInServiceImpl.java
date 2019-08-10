package com.mht.service.impl;

import com.mht.entity.UserSignIn;
import com.mht.mapper.UserSignInMapper;
import com.mht.service.IUserSignInService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 签到流水表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class UserSignInServiceImpl extends ServiceImpl<UserSignInMapper, UserSignIn> implements IUserSignInService {

}
