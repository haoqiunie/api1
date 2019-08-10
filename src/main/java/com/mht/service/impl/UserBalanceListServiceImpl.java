package com.mht.service.impl;

import com.mht.entity.UserBalanceList;
import com.mht.mapper.UserBalanceListMapper;
import com.mht.service.IUserBalanceListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户余额使用流水表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class UserBalanceListServiceImpl extends ServiceImpl<UserBalanceListMapper, UserBalanceList> implements IUserBalanceListService {

}
