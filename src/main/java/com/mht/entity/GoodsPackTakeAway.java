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
public class GoodsPackTakeAway implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 打包走份Banner图
     */
    private String bannerImage;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 单价
     */
    private String price;

    /**
     * 件数
     */
    private String number;

    /**
     * 总金额
     */
    private String totalAmount;

    /**
     * 季节
     */
    private String season;

    /**
     * 码数
     */
    private String yardage;

    /**
     * 风格
     */
    private String style;

    /**
     * 年龄段
     */
    private String ageBracket;

    /**
     * 定金比例
     */
    private String downPayment;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 商品描述
     */
    private String goodsDescription;

    /**
     * 活动规则
     */
    private String activityRules;

    /**
     * 创建用户ID
     */
    private Integer createUserId;

    /**
     * 修改用户
     */
    private Integer updateUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
