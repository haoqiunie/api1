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
 * 商品规格中间表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GoodsSpecificationM implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品规格ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 商品条形码
     */
    private String goodsBarcode;

    /**
     * 颜色ID
     */
    private Integer colorId;

    /**
     * 尺寸ID
     */
    private Integer sizeId;

    /**
     * 供应商定价(阶梯价)
     */
    private String sellerPrice;

    /**
     * 吊牌价
     */
    private BigDecimal tagPrice;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 件/每份
     */
    private Integer quantityPart;

    /**
     * 最低购买份数
     */
    private Integer quantityMin;

    /**
     * 销量
     */
    private Integer quantitySales;

    /**
     * 库存数量
     */
    private Integer quantityRemaining;

    /**
     * 总份数
     */
    private Integer quantityTotal;

    /**
     * 是否控货
     */
    private Boolean isControlGoods;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 邮费(打包走份)
     */
    private Integer postage;

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
     * 自定义规格
     */
    private String customize;

    /**
     * 新系统规格ID
     */
    private Integer newSpecificationId;

    /**
     * 仓库编码 0 SZ,SH 　１SZ　２SH
     */
    private Integer warehouseCode;

    /**
     * 仓库对应的库存　json数据 {"SZ":10,"SH":20}
     */
    private String warehouseStock;

    /**
     * 是否结算
     */
    private Boolean isSettle;


}
