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
 * 用户详细信息
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 冗余角色ID
     */
    private Integer rid;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 省
     */
    private Integer province;

    /**
     * 市
     */
    private Integer city;

    /**
     * 区
     */
    private Integer region;

    private String payPwd;

    /**
     * 合力亿捷登录名
     */
    private String hlyjLoginName;

    /**
     * 是否登录合力亿捷:0=否,1=是
     */
    private Integer attemptLogin;

    /**
     * 买手工号
     */
    private String buyerJobNumber;

    /**
     * 负责的业务微信号
     */
    private String businessWechatId;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
