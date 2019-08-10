package com.mht.model;

import com.mht.entity.GoodsSubject;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 商品规格专题
 * @author: 张逸峰
 * @create: 2019-07-30 11:51
 **/
@Data
public class SpecificationSubject {

    /**
     * 商品专题信息
     */
    private GoodsSubject goodsSubject;

    /**
     * 商品起批量
     */
    private Integer quantityMin;

    /**
     * 初始邮费
     */
    private BigDecimal basicPostage;
    /**
     * 每件邮费(超过部分)
     */
    private BigDecimal postagePart;
    /**
     * 初始件数
     */
    private Integer basicQuantity;

}
