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
public class OrderExchange implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 售出数量
     */
    private Integer soldNum;

    /**
     * 换货数量
     */
    private Integer refundNum;

    /**
     * 结算金额
     */
    private BigDecimal amount;

    private String expressCompanyNo;

    private String expressNo;

    private String explain;

    private String deductExplain;

    /**
     * 扣除押金
     */
    private BigDecimal deductAmount;

    /**
     * 结算时间
     */
    private LocalDateTime accountTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
