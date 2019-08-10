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
public class MiniDistributionSettleOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单ID
     */
    private String orderIds;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 支付金额
     */
    private BigDecimal transAmt;

    /**
     * 是否支付
     */
    private Boolean status;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 支付方式:1=钱包,2=微信
     */
    private Integer payTypeId;

    /**
     * 类型:1=支付,2=申请退款,3=退款成功
     */
    private Integer type;

    /**
     * 原订单ID
     */
    private Integer pid;

    /**
     * 退款时间
     */
    private LocalDateTime refundTime;

    /**
     * 审核人
     */
    private Integer refundUserId;

    /**
     * 拒绝退款原因
     */
    private String opposeExplain;

    /**
     * 退款原因
     */
    private String refundReason;


}
