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
public class OrderPurchaseDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 采购订单ID
     */
    private Integer purchaseId;

    /**
     * 商品规格ID
     */
    private Integer goodsSpecificationId;

    /**
     * 商品条码
     */
    private String goodsBarcode;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 采购链接
     */
    private String purchaseLink;

    /**
     * 颜色
     */
    private String color;

    /**
     * 尺寸/规格
     */
    private String size;

    /**
     * 销售单价
     */
    private BigDecimal price;

    /**
     * 销售数量
     */
    private Integer quantity;

    /**
     * 进货价
     */
    private BigDecimal stockPrice;

    /**
     * 进货平台
     */
    private String stockPlatform;

    /**
     * 进货数量
     */
    private Integer stockNum;


}
