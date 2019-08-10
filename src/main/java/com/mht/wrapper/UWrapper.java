package com.mht.wrapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

/**
 * @description: 自定义修改wrapper类
 * @author: 张逸峰
 * @create: 2019-07-29 19:28
 **/
public class UWrapper<T> extends UpdateWrapper<T> {

    @Override
    protected String columnToString(String column) {
        // 驼峰命名转换为下划线命名
        return StringUtils.camelToUnderline(column);
    }
}
