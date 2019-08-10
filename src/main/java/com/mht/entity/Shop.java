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
 * 用户商店
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 店铺照片1
     */
    private String shopImg1;

    /**
     * 店铺照片2
     */
    private String shopImg2;

    /**
     * 店铺照片3
     */
    private String shopImg3;

    /**
     * 省ID
     */
    private Integer province;

    /**
     * 市ID
     */
    private Integer city;

    /**
     * 区ID
     */
    private Integer region;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系电话
     */
    private String cellphone;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 营业执照
     */
    private String businessImg;

    /**
     * 身份证正面
     */
    private String idImg1;

    /**
     * 身份证反面
     */
    private String idImg2;

    /**
     * 店铺面积
     */
    private String areaId;

    /**
     * 营业额
     */
    private String turnoverId;

    /**
     * 经营年限
     */
    private String businessDurationId;

    /**
     * 价格区间
     */
    private String goodsPriceRangeId;

    /**
     * 店铺类别
     */
    private String catagoryId;

    /**
     * 目前经营品种
     */
    private String goodsVarietyId;

    /**
     * 进货渠道
     */
    private String stockChannelId;

    /**
     * 目前经营品牌
     */
    private String goodsBrand;

    /**
     * 其它进货渠道
     */
    private String otherStockChannel;

    /**
     * 店铺需求及意向描述
     */
    private String remark;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 是否激活:0=未激活,1=已激活
     */
    private Integer isActive;

    /**
     * 订单数量
     */
    private Integer orderNum;

    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 营业执照添加时间
     */
    private LocalDateTime businessImgCreateTime;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 定位地址
     */
    private String locationAddress;


}
