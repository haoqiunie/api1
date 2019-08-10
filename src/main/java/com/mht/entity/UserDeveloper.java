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
public class UserDeveloper implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 区域id
     */
    private Integer areaId;

    /**
     * 一级id
     */
    private Integer level1Id;

    /**
     * 拓展员电话
     */
    private String userCellphone;

    /**
     * 姓名
     */
    private String name;

    /**
     * 级别:0=区域,1=一级,2=二级
     */
    private Integer level;

    /**
     * 推广佣金比例
     */
    private BigDecimal rate;

    /**
     * 结算结束时间
     */
    private LocalDateTime settleEndTime;

    /**
     * 结算开始时间
     */
    private LocalDateTime settleStartTime;

    /**
     * 结算金额
     */
    private Integer amount;

    /**
     * 启用状态:0=停用,1=启用
     */
    private Boolean isCheck;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
