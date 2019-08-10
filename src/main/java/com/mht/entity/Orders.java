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
 * 订单
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属酒店
     */
    private Integer hotelId;

    /**
     * 支付ID
     */
    private Integer payId;

    /**
     * 订单状态：10=待支付,20=已支付,30=已发货,40=已收货
     */
    private Integer state;

    /**
     * 应付金额
     */
    private Double money;

    /**
     * 消耗积分
     */
    private Double score;

    private String memo;

    /**
     * 创建用户ID
     */
    private Integer createUserId;

    /**
     * 最后更新用户ID
     */
    private Integer updateUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否开票
     */
    private Boolean isInvoice;

    private String additionalInfo;

    private String address;

    private String consignee;

    private String tel;

    /**
     * 收获地址
     */
    private Integer addressId;


}
