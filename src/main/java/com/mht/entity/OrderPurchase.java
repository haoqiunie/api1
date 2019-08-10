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
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 供应商id
     */
    private Integer sellerId;

    /**
     * 采购单号
     */
    private String purchaseNo;

    /**
     * 销售订单编号
     */
    private String orderNo;

    /**
     * 状态:1=待采购,2=待收货,3=已收货,4=已发货
     */
    private Integer status;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 物流单号
     */
    private String expressNo;

    /**
     * 物流公司
     */
    private String expressCompanyNo;

    /**
     * 销售邮费
     */
    private Integer marketPostage;

    /**
     * 销售合计
     */
    private BigDecimal marketAmount;

    /**
     * 进货邮费
     */
    private Integer stockPostage;

    /**
     * 进货优惠
     */
    private BigDecimal stockDiscounts;

    /**
     * 进货合计
     */
    private BigDecimal stockAmount;

    /**
     * 退货邮费
     */
    private Integer refundPostage;

    /**
     * 退货合计
     */
    private BigDecimal refundAmount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private Integer updateUserId;


}
