package com.mht.service.impl;

import com.mht.entity.UserLogindata;
import com.mht.mapper.UserLogindataMapper;
import com.mht.service.IUserLogindataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登陆信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class UserLogindataServiceImpl extends ServiceImpl<UserLogindataMapper, UserLogindata> implements IUserLogindataService {

}
