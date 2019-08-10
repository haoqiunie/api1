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
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryRewardLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 获奖记录表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 获奖用户id
     */
    private Integer userId;

    /**
     * 奖品名称
     */
    private String rewardName;

    /**
     * 奖品类型:1=实物奖品,2=优惠券,3=现金红包
     */
    private Integer rewardType;

    /**
     * 奖品id(奖品配置表id)
     */
    private Integer rewardId;

    /**
     * 奖品状态:0=已过期,1=待领取,2=已领取
     */
    private Integer status;

    /**
     * 中奖时间
     */
    private LocalDateTime createTime;


}
