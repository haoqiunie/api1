package com.mht.service.impl;

import com.mht.entity.MiniUser;
import com.mht.mapper.MiniUserMapper;
import com.mht.service.IMiniUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class MiniUserServiceImpl extends ServiceImpl<MiniUserMapper, MiniUser> implements IMiniUserService {

}
