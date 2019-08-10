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
 * 短信验证码表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysCodeSms implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 手机号码
     */
    private String cellphone;

    /**
     * 时间戳
     */
    private String timestamp;

    /**
     * 验证码
     */
    private String code;

    /**
     * 用途:1=注册,2=找回密码
     */
    private Integer purpose;

    /**
     * 短信模板
     */
    private String smsTemplate;

    /**
     * 状态:1=未使用,2=失效,3=已使用
     */
    private Integer status;

    /**
     * 发送状态:0=发送失败 1=发送成功
     */
    private Boolean sendStatus;

    /**
     * IP
     */
    private String ip;

    /**
     * 间隔时间,当前时间小于此时间不能发送短信
     */
    private LocalDateTime intervalTime;

    /**
     * 有效时间
     */
    private LocalDateTime validTime;

    /**
     * 验证时间
     */
    private LocalDateTime verifiTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
