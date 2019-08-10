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
public class MiniDistributionOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 类型:1=平台订单,2=自营订单
     */
    private Integer type;

    /**
     * 店主ID
     */
    private Integer mallUserId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 支付金额
     */
    private BigDecimal transAmt;

    /**
     * 商品总数
     */
    private Integer num;

    /**
     * 物流公司
     */
    private String expressCompanyNo;

    /**
     * 物流单号
     */
    private String expressNo;

    /**
     * 订单状态:1000=待支付,1100=已取消,1200=待结算,2000=待发货,2100=申请退款,2110=已退款(未发货),3000=待收货,3100=申请退款(已发货),3110=已退款(已发货),3200=退货退款(已发货),3210=退款中(允许退款),3211=已退款(收到退货),4000=已完成,4100=店家已退款,4200=平台已退款
     */
    private Integer status;

    /**
     * 是否支付订单
     */
    private Boolean isPayOrder;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 收货时间
     */
    private LocalDateTime receivingTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 原订单ID
     */
    private Integer pid;

    /**
     * 销售收入
     */
    private BigDecimal salesProceeds;

    /**
     * 是否自提
     */
    private Boolean isTakeTheir;

    /**
     * 收货人
     */
    private String name;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 省
     */
    private Integer province;

    /**
     * 市
     */
    private Integer city;

    /**
     * 区
     */
    private Integer region;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 支付订单编号
     */
    private String payOrderNo;

    /**
     * 物流签收时间
     */
    private LocalDateTime signInTime;

    /**
     * 是否结算
     */
    private Boolean isSettle;

    /**
     * 结算订单ID
     */
    private Integer settleOrderId;

    /**
     * 是否退款
     */
    private Boolean isRefund;

    /**
     * 店家申请退款状态:1=申请退款,2=同意退款,3=拒绝退款
     */
    private Integer shopStatus;


}
