package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 店铺列表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ExpandShop implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商店id
     */
    private String id2;

    /**
     * 拓展员
     */
    private Integer userId;

    /**
     * 拓展人员id
     */
    private String userId2;

    /**
     * 商店名称
     */
    private String name;

    /**
     * 拓展日期
     */
    private LocalDate developDate;

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

    private Integer province;

    private Integer city;

    private Integer region;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 门牌号
     */
    private String houseNumber;

    /**
     * 店铺照片
     */
    private String imageName;

    /**
     * 小店铺照片
     */
    private String smallImageName;

    /**
     * 店内照片
     */
    private String innerImage;

    /**
     * 小店内照片
     */
    private String smallInnerImage;

    /**
     * 营业执照
     */
    private String businessImage;

    /**
     * 小营业执照
     */
    private String smallBusinessImage;

    /**
     * 店铺面积:1=20平方以下,2=20平方至50平方,3=50平方至100平方,4=100平方以上
     */
    private String areaId;

    /**
     * 店铺类别:1=零售,2=批发,3=折扣店,4=特卖场,5=地摊,6=网店,7=微商
     */
    private String typeShop;

    /**
     * 目前经营品种:1=男装,2=女装,3=童装,4=内衣,5=鞋靴,6=箱包,7=配饰
     */
    private String typeBrand;

    /**
     * 价格区间:1=50元以下,2=50元至100元,3=100元至200元,4=200元至300元,5=300元以上
     */
    private String typePrice;

    /**
     * 目前进货渠道:1=厂家,2=互联网,3=广东批发市场,4=北京批发市场,5=福建批发市场,6=其他地区批发市场
     */
    private String typeStockChannel;

    /**
     * 是否有意愿合作
     */
    private String isCooperation;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 职位:1=老板,2=店长,3=店员
     */
    private Integer post;

    /**
     * 手机
     */
    private String cellphone;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 微信昵称
     */
    private String wechatNickname;

    /**
     * qq
     */
    private String qq;

    /**
     * 店铺需求及意向描述
     */
    private String remark;

    /**
     * 状态:0=未提交,1=已提交
     */
    private Integer status;

    /**
     * 经营年限:1=一年以下,2=一年至三年,3=三年到五年,4=五年以上
     */
    private Integer typeOperatingPeriodId;

    /**
     * 年营业额:1=5万以下,2=5万到10万,3=10万到20万,4=20万到50万,5=50万以上
     */
    private Integer typeTurnoverId;

    /**
     * 其他地区批发市场
     */
    private String otherStockChannel;

    /**
     * 是否已添加公司业务微信号:0=否,1=是
     */
    private Boolean isAddWechatId;

    /**
     * 目前经营品牌
     */
    private String brand;

    /**
     * 是否安装了APP
     */
    private String isInstallApp;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 店铺资料:1=完整,2=缺失
     */
    private Integer isDataCompleted;

    /**
     * 是否补全资料:0=否,1=是,2=补全资料功能之前的完整的数据
     */
    private Integer isDataSupplemented;

    /**
     * 补全资料时间
     */
    private String supplementTime;

    /**
     * 是否注册微信商城:0=否,1=是
     */
    private Boolean isRegisterMall;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 提交时间
     */
    private String commitTime;

    /**
     * 是否美化:0=否,1=是
     */
    private Integer isBeuti;

    /**
     * 星级:1=一星,2=二星,3=三星,4=四星,5=五星
     */
    private Integer star;

    /**
     * 标签:1=新客户,2=无意向,3=有意向,4=待沟通,5=已成交
     */
    private String tag;

    /**
     * 归属微信号
     */
    private Integer businessWechatId;

    /**
     * 是否注册微信商城
     */
    private Boolean isRegisterWechatMall;


}
