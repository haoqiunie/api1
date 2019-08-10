package com.mht.service.impl;

import com.mht.entity.GoodsSubject;
import com.mht.entity.OrderM;
import com.mht.entity.OrderRefundReason;
import com.mht.entity.UserOrder;
import com.mht.mapper.OrderRefundReasonMapper;
import com.mht.mapper.UserOrderMapper;
import com.mht.service.GoodsOrderService;
import com.mht.service.IGoodsSubjectService;
import com.mht.service.IOrderMService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 商品订单业务实现类
 * @author: 张逸峰
 * @create: 2019-08-06 11:54
 **/
public class GoodsOrderServiceImpl implements GoodsOrderService {

    @Autowired
    private OrderRefundReasonMapper orderRefundReasonMapper;
    @Autowired
    private UserOrderMapper userOrderMapper;

    @Autowired
    private IGoodsSubjectService goodsSubjectService;
    @Autowired
    private IOrderMService orderMService;

    @Override
    public Map<String, Object> applyRefund(Map<String, Object> map, Integer refundNum) {

        Map<String, Object> data = new HashMap<>();

        //获得退款原因
        OrderRefundReason refund_reason = orderRefundReasonMapper.selectById((int) map.get("refund_reason"));
        //获得订单信息
        UserOrder userOrder = userOrderMapper.selectById((int) map.get("order_id"));
        if (userOrder.getReturnExchangeType() != null) {
            data.put("msg","售后订单不能再次申请售后");
        }
        //退款商品信息
        List<Map<String, Object>> refundGoods = (List<Map<String, Object>>) map.get("refund_goods");
        //根据商品规格id获得商品专题
        GoodsSubject goodsSubject = goodsSubjectService.getGoodsSubjectBySpecification((Integer) refundGoods.get(0).get("goods_specification_id"));
        //判断商品专题是否为选款铺货商品
        if (goodsSubject != null && userOrder.getStatus() == 4000 && goodsSubject.getType() == 7) {

        }
        //根据订单id获得订单中间表
        List<OrderM> orderMList = orderMService.getByOrderId(userOrder.getId());

        //商品总数量
        Integer goodsTotalNum = 0;
        //计算原订单商品总数量
        for (OrderM orderM : orderMList) {
            goodsTotalNum += orderM.getQuantity();
        }

        //退款金额
        BigDecimal refundAmount = (BigDecimal) map.get("refund_amount");
        //判断是否为全部退款
        if (refundAmount != null && refundAmount.compareTo(userOrder.getTransAmt()) == 0) {

            //判断订单是否是拆分订单
            if (userOrder.getRefundState() != null && userOrder.getRefundState() == 2){

            }else{
                userOrder.setRefundState(1);
            }
            //TODO 全部退款修改原始订单状态



            //TODO 保存订单退款信息


        } else {
            
            //计算退款金额
            Map<String, BigDecimal> amountMap = calculateRefundAmount(userOrder, orderMList, refundGoods, map);

        }

        return null;
    }


    private Map<String,BigDecimal> calculateRefundAmount(UserOrder userOrder, List<OrderM> orderMList, List<Map<String, Object>> refundGoods,Map<String, Object> map){

        Map<String, BigDecimal> amountMap = new HashMap<>();

        BigDecimal orderRefundAmount = BigDecimal.ZERO;
        BigDecimal activityPrice = BigDecimal.ZERO;
        BigDecimal subjectCashCoupon = BigDecimal.ZERO;
        BigDecimal discountPrice = BigDecimal.ZERO;
        BigDecimal goodsCashCoupon = BigDecimal.ZERO;
        BigDecimal goodsActivityPrice = BigDecimal.ZERO;
        BigDecimal subjectActivityPrice = BigDecimal.ZERO;
        BigDecimal freight = BigDecimal.ZERO;
        //退款金额等于订单支付金额
        BigDecimal refundAmount = (BigDecimal) map.get("refund_amount");
        if ((int)map.get("refund_state") == 3 && userOrder.getStatus() == 2000) {
            //不计算退款金额
        }else{
            for (OrderM orderM : orderMList) {
                for (Map<String, Object> refundGood : refundGoods) {
                    if (orderM.getGoodsSpecificationId().equals(refundGood.get("goods_specification_id"))) {
                        orderRefundAmount = orderRefundAmount.add(orderM.getNetPrice().multiply(new BigDecimal((int)refundGood.get("quantity"))));
                    }
                }
            }

            if (refundAmount != null || BigDecimal.ZERO.compareTo(refundAmount) != 0){
                orderRefundAmount = refundAmount;
            }else{
                //退款比率
                BigDecimal refundRate = orderRefundAmount.divide(userOrder.getGoodsTotalPrice(),2,BigDecimal.ROUND_HALF_UP);

                //按比例返回平台活动优惠
                if (userOrder.getActivityPrice() != null && userOrder.getActivityPrice().compareTo(BigDecimal.ZERO) > 0) {
                    activityPrice = userOrder.getActivityPrice().multiply(refundRate).setScale(2,BigDecimal.ROUND_HALF_UP);
                }
                refundAmount = refundAmount.subtract(activityPrice);
                //TODO 按比例返回使用的专题优惠券
                if (userOrder.getSubjectCashCoupon() != null && userOrder.getSubjectCashCoupon().compareTo(BigDecimal.ZERO) > 0) {
                    subjectCashCoupon = userOrder.getSubjectCashCoupon().multiply(refundRate).setScale(2,BigDecimal.ROUND_HALF_UP);
                }
                refundAmount = refundAmount.subtract(subjectCashCoupon);
                //按比例返回会员使用的优惠券
                if (userOrder.getDiscountPrice() != null && userOrder.getDiscountPrice().compareTo(BigDecimal.ZERO) > 0) {
                    discountPrice = userOrder.getDiscountPrice().multiply(refundRate).setScale(2,BigDecimal.ROUND_HALF_UP);
                }
                refundAmount = refundAmount.subtract(discountPrice);
                //按比例返回使用的全场现金券
                if (userOrder.getGoodsCashCoupon() != null && userOrder.getGoodsCashCoupon().compareTo(BigDecimal.ZERO) > 0) {
                    goodsCashCoupon = userOrder.getGoodsCashCoupon().multiply(refundRate).setScale(2,BigDecimal.ROUND_HALF_UP);
                }
                refundAmount = refundAmount.subtract(goodsCashCoupon);
                //按比例返回专题活动优惠
                if (userOrder.getSubjectActivityPrice() != null && userOrder.getSubjectActivityPrice().compareTo(BigDecimal.ZERO) > 0) {
                    subjectActivityPrice = userOrder.getSubjectActivityPrice().multiply(refundRate).setScale(2,BigDecimal.ROUND_HALF_UP);
                }
                refundAmount = refundAmount.subtract(subjectActivityPrice);
                //按比例返回商品优惠金额
                if (userOrder.getGoodsActivityPrice() != null && userOrder.getGoodsActivityPrice().compareTo(BigDecimal.ZERO) > 0) {
                    goodsActivityPrice = userOrder.getGoodsActivityPrice().multiply(refundRate).setScale(2,BigDecimal.ROUND_HALF_UP);
                }
                refundAmount = refundAmount.subtract(goodsActivityPrice);
                // 返回邮费(待发货订单)
                if (userOrder.getFreight() != null && userOrder.getFreight().compareTo(BigDecimal.ZERO) > 0) {
                    //TODO 计算返回邮费

                }
                refundAmount = refundAmount.add(freight);

            }
        }
        amountMap.put("refund_amount",refundAmount);
        amountMap.put("goods_activity_price",goodsActivityPrice);
        amountMap.put("activity_price",activityPrice);
        amountMap.put("subject_cash_coupon",subjectCashCoupon);
        amountMap.put("discount_price",discountPrice);
        amountMap.put("goods_cash_coupon",goodsCashCoupon);
        amountMap.put("subject_activity_price",subjectActivityPrice);
        amountMap.put("freight",freight);
        amountMap.put("refund_order_amount",orderRefundAmount);
        return amountMap;
    }
}
