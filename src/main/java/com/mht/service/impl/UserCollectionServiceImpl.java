package com.mht.service.impl;

import com.mht.entity.UserCollection;
import com.mht.mapper.UserCollectionMapper;
import com.mht.service.IUserCollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的收藏 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollection> implements IUserCollectionService {

}
