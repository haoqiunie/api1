package com.mht.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品库存表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GoodsInventory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品条形码
     */
    private String barcode;

    /**
     * 款号
     */
    private String girard;

    /**
     * 销售价格
     */
    private BigDecimal price;

    /**
     * 品名
     */
    private String type;

    /**
     * 进货价(阶梯价格)
     */
    private String sellerPrice;

    /**
     * 标牌价
     */
    private BigDecimal tagPrice;

    /**
     * 货位
     */
    private String allocation;

    /**
     * 库存
     */
    private Integer inventory;

    /**
     * 是否控货
     */
    private Boolean isControlGoods;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 修改人
     */
    private Integer updateUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 外部条形码
     */
    private String externalBarcode;

    /**
     * 分销价
     */
    private BigDecimal distributionPrice;

    /**
     * 虚拟库存
     */
    private Integer virtualSales;

    /**
     * 真实库存
     */
    private Integer actualSales;

    /**
     * 采购链接
     */
    private String purchaseLink;

    /**
     * 是否结算
     */
    private Boolean isSettle;


}
