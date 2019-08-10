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
 * 供货商钱包流水
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SellerWalletList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 供货商ID
     */
    private Integer sellerId;

    private String orderNo;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 状态:0=未处理,1=已处理
     */
    private Boolean status;

    private String cardNo;

    private String openBank;

    /**
     * 类型:1=保证金充值,2=余额充值,3=提现
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
