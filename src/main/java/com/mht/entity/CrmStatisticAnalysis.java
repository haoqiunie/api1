package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class CrmStatisticAnalysis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据统计分析主表ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据归属字段名
     */
    private String fieldName;

    /**
     * 数据归属字段名-中文
     */
    private String fieldNameCh;

    /**
     * 数据归属表名
     */
    private String tableName;

    /**
     * 标签名(对应dicts表name字段)
     */
    private String tagValue;

    /**
     * 标签key(对应dicts表value字段)
     */
    private String tagKey;

    /**
     * 店铺数量
     */
    private Integer shopNum;

    /**
     * 统计开始时间
     */
    private LocalDate startTime;

    /**
     * 统计结束时间
     */
    private LocalDate endTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 结束时间
     */
    private LocalDateTime updateTime;


}
