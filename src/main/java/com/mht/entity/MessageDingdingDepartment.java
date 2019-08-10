package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class MessageDingdingDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ppid,主键ID,非业务ID
     */
    @TableId(value = "ppid", type = IdType.AUTO)
    private Integer ppid;

    /**
     * ID
     */
    private String id;

    /**
     * 部门名称
     */
    private String name;

    private String pid;

    /**
     * 类型:1=部门,2=员工
     */
    private Integer type;

    /**
     * 图标
     */
    private String icon;


}
