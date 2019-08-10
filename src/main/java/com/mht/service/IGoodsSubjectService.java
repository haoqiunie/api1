package com.mht.service;

import com.mht.entity.GoodsSubject;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品专题表 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
public interface IGoodsSubjectService extends IService<GoodsSubject> {

    GoodsSubject getGoodsSubjectBySpecification(Integer specificationId);

}
