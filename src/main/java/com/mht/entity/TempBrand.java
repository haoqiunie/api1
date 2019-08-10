package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 同步数据临时表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@FieldNameConstants(prefix = "COLUMN_")
public class TempBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专题ID
     */
    private Integer id;

    /**
     * 品牌名称
     */
    private String name;

}
