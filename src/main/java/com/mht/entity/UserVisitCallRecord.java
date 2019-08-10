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
public class UserVisitCallRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客服ID
     */
    private Integer eovaUserId;

    /**
     * 客户id
     */
    private Integer userId;

    /**
     * 通话时长
     */
    private String duration;

    /**
     * 录音文件名
     */
    private String voiceFileName;

    /**
     * 录音文字内容
     */
    private String voiceText;

    /**
     * 手机号码
     */
    private String cellphone;

    /**
     * 虚拟小号
     */
    private String xCellphone;

    /**
     * 是否绑定成功
     */
    private Boolean isSuccess;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 通话标志
     */
    private String bindId;

    /**
     * 是否录音
     */
    private Boolean isRecord;

    /**
     * 是否下载录音
     */
    private Boolean isDownloadedRecord;

    /**
     * 挂断原因:Caller Hang up=主叫挂机,Called Hang up=被叫挂机,Not Reachable=被叫不可达,Route Failure=路由被叫失败,No Answer=被叫无应答,Abandon=主叫放弃,Call Terminated=呼叫被终止,Call Forbidden=呼叫被禁止,Busy=被叫忙
     */
    private String releaseReason;

    /**
     * 通话开始时间
     */
    private LocalDateTime startTime;

    /**
     * 通话ID
     */
    private String callIdentifier;

    /**
     * 是否已语音转文字
     */
    private Boolean isTrans;


}
