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
public class MiniDistributionOrderRefund implements Serializable {

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
     * 退款金额
     */
    private BigDecimal amount;

    /**
     * 退款方式:1=仅退款,2=退货退款
     */
    private Integer refundStatus;

    /**
     * 退款原因
     */
    private String refundReason;

    /**
     * 退款物流公司
     */
    private String expressCompanyNo;

    /**
     * 退款物流单号
     */
    private String expressNo;

    /**
     * 退款时间
     */
    private LocalDateTime createTime;

    /**
     * 退款失败原因
     */
    private String opposeExplain;

    /**
     * 退款失败时间
     */
    private LocalDateTime opposeTime;

    /**
     * 取消退款时间
     */
    private LocalDateTime cancelTime;

    /**
     * 同意退货退款时间
     */
    private LocalDateTime agreeRefundTime;

    /**
     * 审核人
     */
    private Integer createUserId;


}
