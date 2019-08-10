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
public class MessageNotificationConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 模版
     */
    private Integer messageTemplateId;

    /**
     * 通知人
     */
    private String userId;

    /**
     * 通知状态
     */
    private String notificationStatus;

    /**
     * 发送类型:1=钉钉,2=邮箱,3=短信
     */
    private String notificationType;

    /**
     * 发送状态:1=待发货,2=申请退款,3=申请退货,4=申请退款退货
     */
    private Integer sendStatus;

    /**
     * 是否启用
     */
    private Boolean isUse;

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
