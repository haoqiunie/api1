package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class HeliChatMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    @TableField("VisitorId")
    private String VisitorId;

    @TableField("Account")
    private String Account;

    @TableField("CusNickName")
    private String CusNickName;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Mode")
    private String Mode;

    @TableField("SystemModeMessageType")
    private String SystemModeMessageType;

    @TableField("MsgType")
    private String MsgType;

    @TableField("ToUserName")
    private String ToUserName;

    @TableField("Timestamp")
    private String Timestamp;

    @TableField("MsgId")
    private String MsgId;

    @TableField("Content")
    private String Content;

    @TableField("Event")
    private String Event;

    @TableField("FromUserName")
    private String FromUserName;

    @TableField("AgentId")
    private String AgentId;

    @TableField("AgentName")
    private String AgentName;

    @TableField("SessionID")
    private String SessionID;

    @TableField("SequenceID")
    private String SequenceID;

    /**
     * 万商创建时间
     */
    @TableField("Wslg_create_time")
    private LocalDateTime wslgCreateTime;


}
