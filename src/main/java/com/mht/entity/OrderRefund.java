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
 * 订单退货退款表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderRefund implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 退款标志:1=仅退款,2=退货退款,3=换货
     */
    private Integer type;

    /**
     * 退款金额
     */
    private BigDecimal amount;

    private String image1;

    private String image2;

    private String image3;

    private String image4;

    private String image5;

    /**
     * 货物状态:1=未收到货,2=已收到货
     */
    private Integer goodsState;

    /**
     * 退/换款原因
     */
    private Integer refundReason;

    /**
     * 退款说明
     */
    private String refundExplain;

    /**
     * 退款物流公司
     */
    private String expressCompanyNo;

    /**
     * 退款单号
     */
    private String expressNo;

    /**
     * 申请退款时间
     */
    private LocalDateTime createTime;

    /**
     * 申请退款取消时间
     */
    private LocalDateTime cancelTime;

    /**
     * 拒绝退款原因
     */
    private String opposeExplain;

    /**
     * 退款失败时间
     */
    private LocalDateTime opposeTime;

    /**
     * 退款成功时间
     */
    private LocalDateTime refundTime;

    /**
     * 同意退货退款时间
     */
    private LocalDateTime agreeRefundTime;

    /**
     * 审核人
     */
    private Integer createUserId;


}
