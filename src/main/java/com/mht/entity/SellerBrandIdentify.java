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
public class SellerBrandIdentify implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 供应商
     */
    private Integer sellerId;

    private String brand;

    /**
     * 品牌类型:1=自有品牌,2=授权品牌
     */
    private Integer brandType;

    /**
     * 品牌资质
     */
    private String imageName;

    /**
     * 品牌logo
     */
    private String logoImage;


}
