package com.mht.entity;

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
public class OrderTaskHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 消息记录
     */
    private Integer id;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;

    /**
     * 删除时间
     */
    private LocalDateTime deleteTime;

    /**
     * mq 存放key
     */
    private String mqQueueName;

    /**
     * mq值
     */
    private String requestBody;

    /**
     * 版本
     */
    private Integer version;


}
