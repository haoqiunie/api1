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
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动类型:1=满件立减,2=满额立减,3=满件折扣,4=满额折扣,5=下单立减,6=全场折扣,7=满件每件立减,8=首单,9=限购
     */
    private Integer type;

    /**
     * 参与方式:1=商品,2=专题,3=专题类型,4=平台
     */
    private Integer participateWay;

    /**
     * 满减规则
     */
    private String fullReductionRule;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 是否与专题类型同享:0=否,1=是
     */
    private Boolean subjectTypeCommunion;

    /**
     * 是否与专题同享:0=否,1=是
     */
    private Boolean subjectCommunion;

    /**
     * 是否与平台活动同享:0=否,1=是
     */
    private Boolean sysCommunion;

    /**
     * 是否启用:0=否,1=是
     */
    private Integer isUse;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 修改人
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

    private BigDecimal price;

    /**
     * 专题类型
     */
    private Integer subjectType;

    /**
     * 是否与优惠券同享
     */
    private Boolean couponCommunion;

    /**
     * 活动开始时间
     */
    private LocalDateTime startTime;

    /**
     * 活动结束时间
     */
    private LocalDateTime endTime;


}
