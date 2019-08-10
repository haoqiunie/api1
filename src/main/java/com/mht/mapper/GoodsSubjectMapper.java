package com.mht.mapper;

import com.mht.entity.GoodsSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品专题表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
public interface GoodsSubjectMapper extends BaseMapper<GoodsSubject> {

    public List<GoodsSubject> getSu();

}
