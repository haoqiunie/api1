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
 * 新商品品类表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新商品品类表
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 编码
     */
    private String code;

    /**
     * 品类名称
     */
    private String name;

    /**
     * 品类级别 1 最上级
     */
    private Integer level;

    /**
     * 父品类id  -1 没有父级
     */
    private Integer parentId;

    /**
     * 状态:启用1,不启用0
     */
    private Integer status;

    /**
     * 排序号(越大越优先)
     */
    private Integer sort;

    /**
     * 分类图片
     */
    private String categoryImage;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
