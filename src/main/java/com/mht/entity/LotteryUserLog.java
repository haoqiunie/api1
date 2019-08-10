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
public class LotteryUserLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户获取抽奖次数记录表
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 获取方式id
     */
    private Integer lotteryConfId;

    /**
     * 已获得次数
     */
    private Integer acquiredCount;

    /**
     * 可使用次数
     */
    private Integer ownedCount;

    /**
     * 该方式可获取次数上限
     */
    private Integer limitCount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;


}
