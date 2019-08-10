package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员信息表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会员等级:1=普通会员,2=银卡会员,3=黄金会员,4=铂金会员,5=钻石会员
     */
    private Integer level;

    /**
     * 历史积分
     */
    private Integer historyIntegral;

    /**
     * 可用积分
     */
    private Integer usableIntegral;

    /**
     * 折扣权益:0=无,1=有
     */
    private Boolean discountEquities;

    /**
     * 积分权益:0=无,1=有
     */
    private Boolean integralEquities;

    /**
     * 优先选款权益:0=无,1=有
     */
    private Boolean fitEquities;

    /**
     * 优先发货权益:0=无,1=有
     */
    private Boolean deliverEquities;

    /**
     * 每月兑换优惠券次数
     */
    private Integer exchangeNum;


}
