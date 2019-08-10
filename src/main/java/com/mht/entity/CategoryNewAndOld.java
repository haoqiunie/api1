package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class CategoryNewAndOld implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新旧品类对应关系表
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 新品类id
     */
    private Integer newCategoryId;

    /**
     * 新品类名称
     */
    private String newCategoryName;

    /**
     * 旧品类id
     */
    private Integer oldCategoryId;

    /**
     * 旧品类名称
     */
    private String oldCategoryName;


}
