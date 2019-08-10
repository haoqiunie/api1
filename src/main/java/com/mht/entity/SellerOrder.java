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
public class SellerOrder implements Serializable {

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
     * 用户订单ID
     */
    private Integer orderId;

    /**
     * 供应商ID
     */
    private Integer sellerId;

    /**
     * 订单状态:订单状态:1000=待付款,1100=已取消,2000=待发货,2100=申请退款(未发货),2110=已退款(未发货),3000=待收货,3100=申请退款(已发货),3110=已退款(已发货),3200=退货退款(已发货),3210=退款中(允许退款),3211=已退款(收到退货),4000=待评价,4100=申请退款(已收货),4110=已退款(待评价),4200=退货退款(已收货),4210=退款中(允许退款),4211=已退款(收到退货),4300=已完成
     */
    private Integer status;

    /**
     * 订单总金额
     */
    private BigDecimal goodsTotalPrice;

    /**
     * 订单总数量
     */
    private Integer goodsNum;

    /**
     * 物流公司
     */
    private String expressCompanyNo;

    /**
     * 物流单号
     */
    private String expressNo;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;


}
