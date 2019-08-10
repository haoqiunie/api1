package com.mht.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class MiniDistributionOrderM implements Serializable {

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
     * 规格ID
     */
    private Integer goodsSpecificationId;

    /**
     * 数量
     */
    private Integer quantity;

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
     * 销售收入
     */
    private BigDecimal salesProceeds;

    /**
     * 供应商结算价格
     */
    private BigDecimal sellerCostPrice;


}
