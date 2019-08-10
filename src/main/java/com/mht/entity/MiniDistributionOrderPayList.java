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
public class MiniDistributionOrderPayList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 店主ID
     */
    private Integer mallUserId;

    /**
     * 销售收入
     */
    private BigDecimal salesProceeds;

    /**
     * 支付金额
     */
    private BigDecimal transAmt;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 类型:1=支付,2=退款
     */
    private Integer type;


}
