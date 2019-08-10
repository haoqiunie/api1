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
public class PopularizeWithdraw implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 提现银行卡ID
     */
    private Integer cardId;

    /**
     * 提现金额
     */
    private BigDecimal commission;

    /**
     * 状态:1=申请提现,2=提现成功,3=提现失败
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 处理时间
     */
    private LocalDateTime operateTime;

    /**
     * 处理人员ID
     */
    private Integer operateUserId;

    /**
     * 转账流水号
     */
    private String withdrawOrderNo;

    /**
     * 转账帐号
     */
    private String withdrawAccount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 用户ID
     */
    private Integer userId;


}
