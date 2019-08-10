package com.mht.entity;

import java.math.BigDecimal;
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
public class SellerCostPriceSet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 专题ID
     */
    private Integer subjectId;

    /**
     * 类型:1=满件,2=满额
     */
    private Integer type;

    /**
     * 件
     */
    private Integer piece;

    /**
     * 金额
     */
    private BigDecimal price;

    /**
     * 成本价:1=成本价1,2=成本价2,3=成本价3,4=成本价4,5=成本价5,6=成本价6,7=成本价7,8=成本价8,9=成本价9,10=成本价10
     */
    private Integer costPrice;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
