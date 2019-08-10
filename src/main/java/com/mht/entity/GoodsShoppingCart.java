package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 购物车
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@FieldNameConstants(prefix = "COLUMN_")
public class GoodsShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购物车ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 专题ID
     */
    private Integer subjectId;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 商品规格ID
     */
    private Integer goodsSpecificationId;

    /**
     * 商品数量
     */
    private Integer quantity;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 消息提醒次数
     */
    private Integer messageNoticeCount;

    /**
     * 立即购买存储:0=否,1=是
     */
    private Boolean isTemp;


}
