package com.mht.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 充值流水表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserWalletList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 第三方支付idtype为1时(充值)不能为空。 微信1开头 支付宝2开头 银联3开头
     */
    private String transactionId;

    /**
     * 充值支付类型 0钱包支付 1开头微信 11:H5 12:小程序 13:App  2开头支付宝 3开头银联
     */
    @TableField("payType")
    private Integer payType;

    /**
     * 充值金额
     */
    private BigDecimal amount;

    /**
     * 赠送余额
     */
    private BigDecimal amountPresented;

    /**
     * 状态:0=未处理,1=已处理
     */
    private Boolean status;

    private String cardNo;

    private String name;

    private String openBank;

    private String serialNo;

    /**
     * 类型:1=充值,2=提现,3=支付,4=退款,5=押金充值,6=销售收入,7=活动赠送,8=押金提現
     */
    private Integer type;

    /**
     * 处理人id
     */
    private Integer handleUserId;

    /**
     * 处理时间
     */
    private LocalDateTime handleTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 拒绝提现原因
     */
    private String refuseReason;

    /**
     * 钱包余额
     */
    private BigDecimal vWallet;


}
