package com.mht.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mht.entity.TempBrand;
import com.mht.entity.Users;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
public interface TempBrandMapper extends BaseMapper<TempBrand> {
    List<Integer> getList();

    List<TempBrand> getT(Integer id);
}
