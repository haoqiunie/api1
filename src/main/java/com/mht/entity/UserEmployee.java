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
 * 员工表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * eova_user_id
     */
    private Integer eovaUserId;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别:1=男,2=女
     */
    private Integer gender;

    /**
     * 类型:1=销售,2=售后
     */
    private Integer type;

    /**
     * 更新人
     */
    private String updateUserId;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
