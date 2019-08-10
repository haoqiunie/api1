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
 * 商店审核表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ShopAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店铺ID
     */
    private Integer shopId;

    /**
     * 营业执照审核:0=不通过,1=通过
     */
    private Integer auditBusinessImage;

    /**
     * 营业执照审核不通过原因
     */
    private String businessRefuseReason;

    /**
     * 营业执照状态:1=未提交,2=审核中,3=审核未通过,4=审核通过
     */
    private Integer auditBusinessStatus;

    /**
     * 图片审核:1=通过,2=无相片,3=门头照片与店铺名称、经营事实不符,4=门头照片未关联GPS定位或GPS定位与店铺地址不符
     */
    private Integer auditImage;

    /**
     * 位置审核:1=通过,2=无GPS信息或GPS与店铺地址不符
     */
    private Integer auditMap;

    /**
     * 地址审核:1=通过,2=店铺地址未精确到街道、门牌号
     */
    private Integer auditAddress;

    /**
     * 商店类别审核:1=一类(零售/折扣店/特卖场),2=二类(地摊),3=三类(微商/网店/批发),4=四类(鞋靴店/内衣店/箱包店),5=五类(品牌专卖店/工厂直营店)
     */
    private Integer auditShopLevel;

    /**
     * 目前经营品牌审核:1=通过,2=需求未认真填写
     */
    private Integer auditBrand;

    /**
     * 朋友圈:1=通过,2=朋友圈未能证实店铺真实性
     */
    private Integer auditCircleFriends;

    /**
     * 业务微信号公众号审核:1=通过,2=未关注公众号,3=非店铺主动添加公司业务号,4=微信未回复
     */
    private Integer audtiOfficialWechat;

    /**
     * 联系人:1=通过,2=联系人信息不详
     */
    private Integer auditContacts;

    /**
     * 职位:1=通过,2=非老板
     */
    private Integer auditPosition;

    /**
     * 手机号码:1=通过,2=电话空号
     */
    private Integer auditCellphone;

    /**
     * 微信号:1=通过,2=未添加好友,3=添加后删除好友,4=微信用户不存在,5=.未回复，微信及朋友圈资料无法判定店铺情况
     */
    private Integer auditWechat;

    /**
     * 用户身份:1=店铺,2=拓展员,3=测试
     */
    private Integer auditIdentity;

    /**
     * 经营品种:1=通过,2=非服装店
     */
    private Integer auditVariety;

    /**
     * 店铺需求及意向描述:1=通过,2=需求未认真填写
     */
    private Integer auditRequirement;

    /**
     * 审核状态:1=未提交,2=已提交(审核中),3=审核未通过,4=用户审核通过,5=店铺审核通过
     */
    private Integer auditStatus;

    /**
     * 审核金额
     */
    private Integer auditAmount;

    /**
     * 更新审核人
     */
    private Integer updateUserId;

    /**
     * 审核人ID
     */
    private Integer createUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 激活奖励
     */
    private Integer activeAmount;

    /**
     * 是否审核:0=未审核,1=已审核
     */
    private Integer isAudit;


}
