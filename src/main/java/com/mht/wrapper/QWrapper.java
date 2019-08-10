package com.mht.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

/**
 * @description: 自定义查询Wrapper类
 * @author: 张逸峰
 * @create: 2019-07-29 14:54
 **/
public class QWrapper<T>  extends QueryWrapper<T> {



    @Override
    protected String columnToString(String column) {
        // 驼峰命名转换为下划线命名
        return StringUtils.camelToUnderline(column);
    }
}
