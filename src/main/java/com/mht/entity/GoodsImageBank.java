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
public class GoodsImageBank implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String smallName;

    /**
     * 排序号
     */
    private Integer orderNo;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 使用时间
     */
    private LocalDateTime updateTime;

    /**
     * 使用人
     */
    private Integer updateUserId;

    /**
     * 类型:1=轮播图,2=详情图,3=视频
     */
    private Integer type;

    /**
     * 商品ID
     */
    private Integer goodsId;


}
