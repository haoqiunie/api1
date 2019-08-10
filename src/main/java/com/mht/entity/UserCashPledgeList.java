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
public class UserCashPledgeList implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户
     */
    private Integer userId;

    private String orderNo;

    /**
     * 充值金额
     */
    private BigDecimal amount;

    /**
     * 状态:0=未处理,1=已处理
     */
    private Boolean status;

    private String cardNo;

    private String name;

    private String openBank;

    /**
     * 支付方式:1=钱包,2=微信
     */
    private Integer payType;

    /**
     * 类型:1=充值,2=提现,3=押金扣减
     */
    private Integer type;

    /**
     * 处理人
     */
    private Integer handleUserId;

    /**
     * 处理时间
     */
    private LocalDateTime handleTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;


}
