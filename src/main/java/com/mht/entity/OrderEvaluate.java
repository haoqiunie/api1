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
 * 商品评价表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderEvaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 款式:1=满意,2=偏多,3=偏少
     */
    private Integer design;

    /**
     * 风格:1=满意,2=基本符合,3=不符合
     */
    private Integer style;

    /**
     * 质量:1=满意,2=一般,3=不满意
     */
    private Integer quality;

    /**
     * 码数S:1=满意,2=偏多,3=偏少
     */
    private Integer yardageS;

    /**
     * 码数M:1=满意,2=偏多,3=偏少
     */
    private Integer yardageM;

    /**
     * 码数L:1=满意,2=偏多,3=偏少
     */
    private Integer yardageL;

    /**
     * 物流:1=1星,2=2星,3=3星,4=4星,5=5星
     */
    private Integer logistics;

    /**
     * 服务:1=1星,2=2星,3=3星,4=4星,5=5星
     */
    private Integer service;

    /**
     * 建议
     */
    private String suggest;

    /**
     * 评价时间
     */
    private LocalDateTime createTime;


}
