package com.mht.service.impl;

import com.mht.entity.UserMember;
import com.mht.mapper.UserMemberMapper;
import com.mht.service.IUserMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class UserMemberServiceImpl extends ServiceImpl<UserMemberMapper, UserMember> implements IUserMemberService {

}
