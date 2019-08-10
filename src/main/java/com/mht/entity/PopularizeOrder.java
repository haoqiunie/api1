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
public class PopularizeOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单状态:0=无效,1=有效
     */
    private Integer status;

    /**
     * 推广订单金额
     */
    private BigDecimal amount;

    /**
     * 佣金金额
     */
    private BigDecimal commission;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 分享规则ID
     */
    private Integer psrId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 返佣日期
     */
    private LocalDateTime rebateTime;


}
