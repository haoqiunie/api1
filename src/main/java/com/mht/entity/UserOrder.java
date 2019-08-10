package com.mht.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

/**
 * <p>
 * 商品订单表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@FieldNameConstants(prefix = "COLUMN_")
public class UserOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 支付金额
     */
    private BigDecimal transAmt;

    /**
     * 订单总金额
     */
    private BigDecimal goodsTotalPrice;

    /**
     * 邮费模板ID
     */
    private Integer freightId;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 商品优惠金额
     */
    private BigDecimal goodsActivityPrice;

    /**
     * 专题优惠金额
     */
    private BigDecimal subjectActivityPrice;

    /**
     * 全场优惠
     */
    private BigDecimal activityPrice;

    /**
     * 物流现金券
     */
    private BigDecimal logisticsCoupon;

    /**
     * 全场现金券满减金额
     */
    private BigDecimal goodsCashCoupon;

    /**
     * 专题现金券满减金额
     */
    private BigDecimal subjectCashCoupon;

    /**
     * 赠送物流现金券
     */
    private BigDecimal logisticsCouponPresented;

    /**
     * 赠送商品现金券
     */
    private BigDecimal goodsCashCouponPresented;

    /**
     * 物流公司
     */
    private String expressCompanyNo;

    /**
     * 物流单号
     */
    private String expressNo;

    /**
     * 支付方式ID
     */
    private Integer payTypeId;

    /**
     * 审核状态:1=待采购审核,2=待仓库审核,3=待买手审核,4=待财务审核,5=已审核,6=待供应商审核
     */
    private Integer auditStatus;

    /**
     * 订单状态:1000=待付款,1100=已取消,2000=待发货,2100=申请退款(未发货),2110=已退款(未发货),2200=申请换货(未发货),3000=待收货,3100=申请退款(已发货),3110=已退款(已发货),3200=退货退款(已发货),3210=允许退款(已发货),3211=已退款(已发货),3300=申请换货(已发货),4000=已完成,4300=已完成,8000=待付定金(预售订单),8100=待付尾款(预售订单),8200=待发货(预售订单),8300=待收货(预售订单),8400=已完成(预售订单),8010=已取消(预售订单),8500=待付全款(预售订单)
     */
    private Integer status;

    /**
     * 收件人
     */
    private String name;

    /**
     * 联系电话
     */
    private String cellphone;

    /**
     * 省
     */
    private Integer regionId1;

    /**
     * 市
     */
    private Integer regionId2;

    /**
     * 区
     */
    private Integer regionId3;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 邮编
     */
    private String zipCode;

    /**
     * 是否已删除:0=未删除,1=已删除
     */
    private Boolean isDelete;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 完成时间
     */
    private LocalDateTime completeTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 邮费支付方式:1=预付,2=到付
     */
    private Integer postagePayType;

    /**
     * 实付邮费
     */
    private BigDecimal realityPostage;

    /**
     * 订单类型:1=普通,2=押金铺货
     */
    private Integer type;

    /**
     * 取消原因
     */
    private String cancelReason;

    /**
     * 签收时间
     */
    private LocalDateTime signInTime;

    /**
     * 订单占用额度
     */
    private BigDecimal occupancyLimits;

    /**
     * 已结算数量
     */
    private Integer expendNum;

    /**
     * 未结算数量
     */
    private Integer unbalancedNum;

    /**
     * 收货时间
     */
    private LocalDateTime receivingTime;

    /**
     * 销售人员id
     */
    private Integer marketId;

    /**
     * 售后人员id
     */
    private Integer marketAfterId;

    /**
     * 买手
     */
    private Integer buyerId;

    /**
     * 采购
     */
    private Integer purchaseId;

    /**
     * 仓库:1=深圳,2=上海,3=自有供应商
     */
    private Integer shoppingOrigin;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 父订单id
     */
    private Integer pId;

    /**
     * 交易金额
     */
    private BigDecimal payOrderAmount;

    /**
     * 支付订单号
     */
    private String payOrderNo;

    /**
     * 专题ID
     */
    private Integer subjectId;

    /**
     * 会员折扣
     */
    private BigDecimal discountPrice;

    /**
     * 物流信息是否已读:0=未读,1=已读
     */
    private Boolean isReadLogistics;

    /**
     * 满减活动名称
     */
    private String activityPriceName;

    /**
     * 是否为预售订单
     */
    private Boolean isPresell;

    /**
     * 是否为尾款支付订单
     */
    private Boolean isFinallOrder;

    /**
     * 买家留言
     */
    private String buyerMessage;

    /**
     * 全场通用现金券ID
     */
    private Integer totalCashcouponId;

    /**
     * 退换货类型:1=退货订单,2=换货订单
     */
    private Integer returnExchangeType;

    /**
     * 换货对应退货订单编号
     */
    private Integer refundOrderId;

    /**
     * 消息通知次数
     */
    private Integer messageNoticeCount;

    /**
     * 退款类型:1=全部退款,2=部分退款
     */
    private Integer refundState;

    /**
     * 供应商ID
     */
    private Integer sellerId;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 是否缺货:0=否,1=是
     */
    private Integer isStockout;

    /**
     * 是否网点订单
     */
    private Boolean isWebsite;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 商品总件数
     */
    private Integer num;

    /**
     * 是否永久可退款订单
     */
    private Boolean refund;

    /**
     * 支付时的openid
     */
    private String payOpenid;


}
