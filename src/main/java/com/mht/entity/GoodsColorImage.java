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
public class GoodsColorImage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品颜色图片中间表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品表id
     */
    private Integer goodsId;

    /**
     * 颜色名称
     */
    private String colorName;

    /**
     * 图片路径
     */
    private String imageUrl;


}
