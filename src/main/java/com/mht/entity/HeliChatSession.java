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
public class HeliChatSession implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("Account")
    private String Account;

    @TableField("VisitorId")
    private String VisitorId;

    @TableField("Address")
    private String Address;

    /**
     * 结束时间
     */
    @TableField("EndTime")
    private LocalDateTime EndTime;

    /**
     * 开始时间
     */
    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("Operation")
    private String Operation;

    @TableField("AgentTotalResponseTimeLength")
    private String AgentTotalResponseTimeLength;

    @TableField("ChannelId")
    private String ChannelId;

    @TableField("AgentHandleStartTime")
    private String AgentHandleStartTime;

    @TableField("AgentId")
    private String AgentId;

    @TableField("AgentName")
    private String AgentName;

    @TableField("assignAgentTime")
    private String assignAgentTime;

    @TableField("SequenceId")
    private String SequenceId;

    @TableField("Status")
    private String Status;

    @TableField("CusNickName")
    private String CusNickName;

    private String ip;

    @TableField("CustSendMessageCount")
    private String CustSendMessageCount;

    @TableField("SkillGroupId")
    private String SkillGroupId;

    @TableField("AgentHandleEndTime")
    private String AgentHandleEndTime;

    @TableField("SkillGroupName")
    private String SkillGroupName;

    @TableField("AgentSendMessageCount")
    private String AgentSendMessageCount;

    @TableField("AgentFirstResponseTimeLength")
    private String AgentFirstResponseTimeLength;

    @TableField("Event")
    private String Event;

    @TableField("channelName")
    private String channelName;

    @TableField("SessionID")
    private String SessionID;

    @TableField("ChannelType")
    private String ChannelType;

    @TableField("timeOutReason")
    private String timeOutReason;

    @TableField("businessParam")
    private String businessParam;

    /**
     * 万商创建时间
     */
    @TableField("Wslg_create_time")
    private LocalDateTime wslgCreateTime;


}
