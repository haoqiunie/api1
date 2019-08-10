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
public class LotteryReward implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 奖品表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 奖品名称
     */
    private String name;

    /**
     * 总件数
     */
    private Integer inventory;

    /**
     * 状态:0=未启用,1=启用
     */
    private Boolean status;

    /**
     * 奖品类型:1=实物奖品,2=优惠券,3=现金红包
     */
    private Integer type;

    /**
     * 奖品类型id
     */
    private Integer typeId;

    /**
     * 奖品图片
     */
    private String imageName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime updateTime;


}
