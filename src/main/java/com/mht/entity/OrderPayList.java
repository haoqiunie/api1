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
public class OrderPayList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String orderNo;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 交易金额
     */
    private BigDecimal transAmt;

    /**
     * 钱包金额
     */
    private BigDecimal amount;

    /**
     * 赠送余额
     */
    private BigDecimal amountPresented;

    /**
     * 支付方式:1=钱包,2=微信
     */
    private Integer payTypeId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
