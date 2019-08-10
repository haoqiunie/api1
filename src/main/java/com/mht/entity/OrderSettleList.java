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
public class OrderSettleList implements Serializable {

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
     * 结算数量
     */
    private Integer num;

    /**
     * 应结算金额
     */
    private BigDecimal settleAmount;

    /**
     * 优惠
     */
    private BigDecimal discounts;

    /**
     * 实付金额
     */
    private BigDecimal amountPaid;

    private String orderNo;

    /**
     * 状态:0=未结算,1=已结算
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 处理人
     */
    private Integer handleUserId;

    /**
     * 处理时间
     */
    private LocalDateTime handleTime;


}
