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
public class CrmShopGoodsClass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品分类表ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商铺ID
     */
    private Integer shopId;

    /**
     * 季节
     */
    private Integer season;

    /**
     * 类别
     */
    private Integer category;

    /**
     * 品类
     */
    private Integer goodsClass;

    /**
     * 进货价
     */
    private Integer goodsPriceRangeId;

    /**
     * 零售价
     */
    private Integer retailPrice;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建人ID
     */
    private Integer createUser;


}
