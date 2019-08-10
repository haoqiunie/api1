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
public class OaAssetEquipment implements Serializable {

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
     * 员工ID
     */
    private Integer employeeId;

    /**
     * 设备类型:1=台式电脑,2=笔记本电脑,3=安卓手机,4=苹果手机
     */
    private Integer type;

    /**
     * 手机号码
     */
    private String cellphone;

    /**
     * IP
     */
    private String ip;

    /**
     * MAC
     */
    private String mac;

    /**
     * 信号类型:1=无网络连接,2=2.4G,3=5G,4=有线连接
     */
    private Integer signalType;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
