package com.mht.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@FieldNameConstants(prefix = "COLUMN_")
public class OrderM implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 供应商ID
     */
    private Integer sellerId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 商品规格ID
     */
    private Integer goodsSpecificationId;

    /**
     * 尺寸
     */
    private String sizeName;

    /**
     * 颜色
     */
    private String colorName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 原价
     */
    private BigDecimal netPrice;

    /**
     * 供应商结算价格
     */
    private BigDecimal sellerCostPrice;

    /**
     * 换货数量
     */
    private Integer exchangeNum;

    /**
     * 是否换货
     */
    private Boolean isExchange;

    /**
     * 是否需要采购
     */
    private Boolean isPurchase;

    /**
     * 缺货数量
     */
    private Integer stockoutNum;

    /**
     * 每份件数
     */
    private Integer quantityPart;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 退款数量
     */
    private Integer refundNum;


}
