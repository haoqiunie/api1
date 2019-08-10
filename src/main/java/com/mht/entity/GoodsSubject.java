package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 商品专题表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@FieldNameConstants(prefix = "COLUMN_")
public class GoodsSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 供货商ID
     */
    private Integer sellerId;

    /**
     * 状态:1=待上架,2=审核中,3=销售中
     */
    private Integer status;

    /**
     * 专题类型:1=专题,2=预售,3=一元抢购,4=押金铺货,5=打包走份,6=小程序,7=铺货选款混批,8=一件代发,14=抽奖专题
     */
    private Integer type;

    /**
     * 名称
     */
    private String name;

    /**
     * 封面图
     */
    private String imageName;

    /**
     * 小程序banner图
     */
    private String minibannerImage;

    /**
     * banner图
     */
    private String bannerImage;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 货源
     */
    private String source;

    /**
     * 品牌介绍
     */
    private String brands;

    /**
     * 品质
     */
    private String quality;

    /**
     * 价格
     */
    private String price;

    /**
     * 发货时间
     */
    private String dispatchTime;

    /**
     * 折扣
     */
    private String discount;

    /**
     * 活动
     */
    private String activities;

    /**
     * 每天点击量
     */
    private Integer dayHits;

    /**
     * 点击量
     */
    private Integer hits;

    /**
     * 最小起批量
     */
    private Integer atLeastNum;

    /**
     * 是否启用: 1-启用,0-停用
     */
    private Boolean isUse;

    /**
     * 排序号
     */
    private Integer sortNo;

    /**
     * 更新用户
     */
    private Integer updateUserId;

    /**
     * 创建用户
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
     * 启用时间
     */
    private LocalDateTime useTime;

    /**
     * 邮费ID
     */
    private Integer freightId;

    /**
     * 仓库id
     */
    private Integer warehouse;

    /**
     * 商品默认品牌
     */
    private Integer goodsBrand;

    /**
     * 商品默认起批量
     */
    private Integer goodsLessNum;

    /**
     * 商品默认描述
     */
    private String goodsDescribe;

    /**
     * 风格
     */
    private String style;

    /**
     * 活动ID
     */
    private String activityId;

    private Integer popularizeCommissionId;

    /**
     * 是否同步品牌
     */
    private Integer useGoodsBrand;

    /**
     * 是否同步起批量
     */
    private Integer useGoodsLessNum;

    /**
     * 是否同步描述
     */
    private Integer useGoodsDescribe;

    /**
     * 专题长链接
     */
    private String longLink;

    /**
     * 分享短链接
     */
    private String shortLink;

    /**
     * 起批模式:1=普通,2=同色齐码,3=同码齐色,4=齐色齐码
     */
    private Integer batchMode;

    /**
     * 批量起批数量
     */
    private Integer batchQuantity;

    /**
     * 起批描述
     */
    private String batchDescribe;

    /**
     * 是否为预售商品
     */
    private Boolean isPresell;

    /**
     * 预售设置ID
     */
    private Integer presellSetId;

    /**
     * 是否为分销商品
     */
    private Boolean isDistribution;

    /**
     * 副标题
     */
    private String subhead;

    /**
     * 专题描述
     */
    private String describe;

    /**
     * 是否展示在首页
     */
    private Boolean indexShow;

    /**
     * 是否限时抢购专题
     */
    private Boolean isSeckill;

    /**
     * 文字标签
     */
    private String tagText;

    /**
     * 图片标签
     */
    private String tagImage;

    /**
     * 商品附属信息ID
     */
    private String subsidiaryId;

    /**
     * 活动规则
     */
    private String activityRule;

    /**
     * 活动专区跳转链接
     */
    private String skipUrl;

    /**
     * 专题描述
     */
    private String subjectDescribe;

    /**
     * 分享关键词
     */
    private String shareTitle;

    /**
     * 分享内容
     */
    private String shareContent;

    /**
     * 限购数量
     */
    private Integer quotaNum;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 档期
     */
    private Integer auctionCalendar;

    /**
     * 货源
     */
    private String freightSource;


}
