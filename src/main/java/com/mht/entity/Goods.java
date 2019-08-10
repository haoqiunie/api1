package com.mht.entity;

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
 * 商品表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@FieldNameConstants(prefix = "COLUMN_")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 专题ID
     */
    private Integer subjectId;

    /**
     * 品牌ID
     */
    private Integer brandIntroduceId;

    /**
     * 审核状态:1=待上架,2=审核中,3=销售中
     */
    private Integer auditStatus;

    /**
     * 季节:1=春季,2=夏季,3=秋季,4=冬季
     */
    private Integer season;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 封面图
     */
    private String imageName;

    /**
     * 单位:1=件,2=条,3=份,4=双,5=包,6=套
     */
    private Integer unit;

    /**
     * 商品描述
     */
    private String describe;

    /**
     * 默认显示规格
     */
    private Integer defaultSpecificationId;

    /**
     * 卖点介绍
     */
    private String sellingPoints;

    /**
     * 是否显示卖点
     */
    private Boolean sellingPointsShow;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 是否显示品牌
     */
    private Boolean brandShow;

    /**
     * 年份
     */
    private String productiveYear;

    /**
     * 是否显示年份
     */
    private Boolean productiveYearShow;

    /**
     * 重量
     */
    private Double weight;

    /**
     * 码数
     */
    private String yardage;

    /**
     * 是否显示码数
     */
    private Boolean yardageShow;

    /**
     * 是否显示类别
     */
    private Boolean categoryShow;

    /**
     * 物流
     */
    private String expressCompany;

    /**
     * 是否显示物流
     */
    private Boolean expressCompanyShow;

    /**
     * 材质
     */
    private String material;

    /**
     * 是否显示材质
     */
    private Boolean materialShow;

    /**
     * 总件数
     */
    private String total;

    /**
     * 是否显示总件数
     */
    private Boolean totalShow;

    private String color;

    /**
     * 是否显示颜色
     */
    private Boolean colorShow;

    /**
     * 退换货
     */
    private String changingOrRefunding;

    /**
     * 是否显示退换货
     */
    private Boolean changingOrRefundingShow;

    /**
     * 客服电话
     */
    private String serviceTel;

    /**
     * 是否显示客服电话
     */
    private Boolean serviceTelShow;

    /**
     * 发货地
     */
    private String dispatchPlace;

    /**
     * 是否显示发货地
     */
    private Boolean dispatchPlaceShow;

    /**
     * 每天点击量
     */
    private Integer dayHits;

    /**
     * 点击量
     */
    private Integer hits;

    /**
     * 商品起批量
     */
    private Integer quantityMin;

    /**
     * 是否启用
     */
    private Boolean isUse;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 创建人
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
     * 审核时间
     */
    private LocalDateTime auditTime;

    /**
     * 审核描述
     */
    private String auditRemark;

    /**
     * 审核人
     */
    private Integer auditUserId;

    /**
     * 详细说明
     */
    private String detailedDescription;

    /**
     * 品类
     */
    private Integer category;

    /**
     * 供应商商品条码
     */
    private String code;

    /**
     * 活动ID
     */
    private String activityId;

    /**
     * 采购链接
     */
    private String purchaseLink;

    /**
     * 推荐商品ID(默认4个）
     */
    private String recommendedId;

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
     * 分类
     */
    private Integer classfiy;

    /**
     * 是否店铺上传商品
     */
    private Boolean isShopGoods;

    /**
     * 排序号
     */
    private Integer sortNo;

    /**
     * 是否为大牌好货
     */
    private Boolean isBigGood;

    /**
     * 是否展示在首页
     */
    private Boolean indexShow;

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
     * 已设置提醒人数
     */
    private Integer remindNum;

    /**
     * 活动规则
     */
    private String activityRule;

    /**
     * 二维码
     */
    private String qrcodeUrl;

    /**
     * 限购数量
     */
    private Integer quotaNum;

    /**
     * 新系统商品ID
     */
    private Integer newGoodsId;

    /**
     * 分享关键字
     */
    private String shareTitle;

    /**
     * 分享内容
     */
    private String shareContent;

    /**
     * 供应商编码
     */
    private String sellerCode;

    /**
     * 是否控货
     */
    private Boolean isControlGoods;


}
