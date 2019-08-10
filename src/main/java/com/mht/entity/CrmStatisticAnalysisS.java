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
public class CrmStatisticAnalysisS implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据统计分析子表ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 主数据归属字段名
     */
    private Integer fFieldName;

    /**
     * 主数据归属字段值key
     */
    private String tagKey;

    /**
     * 子数据归属字段名
     */
    private String sFieldName;

    /**
     * 子数据归属表名
     */
    private String sTableName;

    /**
     * 标签名(对应dicts表name字段)
     */
    private String tagValue;

    /**
     * 子数据归属字段名-中文
     */
    private String sFieldNameCh;

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
