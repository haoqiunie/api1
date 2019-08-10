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
public class CashCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String title;

    /**
     * 满足金额
     */
    private BigDecimal meetAmount;

    /**
     * 减少金额
     */
    private BigDecimal reduceAmount;

    /**
     * 来源:1=签到,2=分享,3=新注册会员,4=完善会员资料,5=进货消费所得,6=参与活动,7=进货消费抵扣,8=平台赠送,9=积分兑换
     */
    private Integer source;

    /**
     * 类型:1=商品现金券,2=物流现金券
     */
    private Integer type;

    /**
     * 优惠券剩余数量
     */
    private Integer useableNum;

    /**
     * 优惠券总数量
     */
    private Integer totalNum;

    /**
     * 兑换所需积分
     */
    private Integer integral;

    /**
     * 是否同享
     */
    private Boolean isCommunion;

    /**
     * 使用范围:1=全场通用,2=品类范围使用,3=专题范围使用
     */
    private Integer useRange;

    /**
     * 专题ID
     */
    private Integer subject;

    /**
     * 专题使用描述
     */
    private String subjectName;

    /**
     * 品类ID
     */
    private Integer category;

    /**
     * 品类使用描述
     */
    private String categoryName;

    /**
     * 扣减类型:1=满减,2=立减
     */
    private Integer deductionType;

    /**
     * 优惠券序列号
     */
    private String serialNumber;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private Integer updateUserId;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 领取之后有效时间(天)
     */
    private Integer validTime;


}
