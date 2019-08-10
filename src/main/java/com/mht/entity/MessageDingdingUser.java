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
 * 钉钉用户表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MessageDingdingUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 唯一标识
     */
    private String unionId;

    /**
     * 员工名字
     */
    private String name;

    /**
     * 分机号
     */
    private String tel;

    /**
     * 办公地点
     */
    private String workPlace;

    /**
     * 备注
     */
    private String remark;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 企业邮箱
     */
    private String orgEmail;

    /**
     * 是否已经激活
     */
    private Boolean isActive;

    /**
     * 排序
     */
    private String orderInDepts;

    /**
     * 是否管理员
     */
    private Boolean isAdmin;

    /**
     * 是否老板
     */
    private Boolean isBoss;

    /**
     * 主管
     */
    private String isLeaderInDepts;

    /**
     * 是否号码隐藏
     */
    private Boolean isHide;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 职位信息
     */
    private String position;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 入职时间
     */
    private LocalDateTime hiredDate;

    /**
     * 员工工号
     */
    private String jobnumber;

    /**
     * 扩展属性
     */
    private String extattr;

    /**
     * 是否是高管
     */
    private Boolean isSenior;

    /**
     * 国家地区码
     */
    private String stateCode;

    /**
     * 角色列表
     */
    private String roles;


}
