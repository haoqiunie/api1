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
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 产品类型：1=租赁商品，2=积分商品
     */
    private Integer type;

    /**
     * 分类
     */
    private Integer category;

    /**
     * 材料
     */
    private Integer stuff;

    /**
     * 尺码
     */
    private Integer sizes;

    private String name;

    private String img;

    /**
     * 试用单价
     */
    private Double testPrice;

    /**
     * 商品单价
     */
    private Double price;

    /**
     * 消耗积分：购买商品需消耗的积分
     */
    private Integer costScore;

    /**
     * 奖励积分
     */
    private Integer score;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
