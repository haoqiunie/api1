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
public class CrmAdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户权限账户配置表ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * eova库用户ID
     */
    private Integer eovaUserId;

    /**
     * eova库用户账号
     */
    private String eovaUserLoginId;

    /**
     * 权限账号
     */
    private String name;

    /**
     * 权限密码
     */
    private String pass;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
