package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 现金券流水表,包含两类,1-商品现金券,2-物流现金券
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserCashCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 现金券ID
     */
    private Integer cashCouponId;

    /**
     * 待使用:0=未使用,1=待使用
     */
    private Integer stayUsed;

    /**
     * 是否快过期:1=新到,2=快过期
     */
    private Integer approachExpire;

    /**
     * 状态:1=未使用,2=已使用,3=已过期
     */
    private Integer status;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 开始使用时间
     */
    private LocalDateTime useStartTime;

    /**
     * 使用到期时间
     */
    private LocalDateTime useEndTime;


}
