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
public class AppVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 终端:1=android,2=IOS
     */
    private Integer terminal;

    /**
     * 线上版本号
     */
    private String downloadVersion;

    /**
     * 更新版本号
     */
    private String updateVersion;

    /**
     * IOS热更新最低版本号
     */
    private String iosLowVersion;

    /**
     * 更新地址
     */
    private String updateUrl;

    /**
     * 下载地址
     */
    private String downloadUrl;

    /**
     * 是否开启服务器下载
     */
    private Boolean isDownload;

    /**
     * 更新内容
     */
    @TableField("noticeWord")
    private String noticeWord;

    /**
     * 是否部分更新
     */
    private Boolean isPartUpdate;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private Integer updateUserId;


}
