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
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserVisit implements Serializable {

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
     * 店铺等级:1=中端店,2=低端店,3=精品店
     */
    private Integer shopLevel;

    /**
     * 风格:1=淑女,2=休闲,3=时尚韩版,4=棉麻,5=简约通勤,6=民族风,7=街头潮人
     */
    private String style;

    /**
     * 零售价:1=50以下,2=50-100,3=100-150,4=150-200,5=200-250,6=250-300,7=300-500,8=500以上
     */
    private String retailPrice;

    /**
     * 主营类目:1=西装,2=夹克,3=大衣,4=羽绒服,5=棉服,6=马甲,7=皮草,8=套装,9=针织开衫,10=风衣,11=针织衫,12=T恤,13=衬衫,14=套头衫,15=短裤,16=长裤,17=背带裤,18=连衣裙,19=半裙,20=背带裙,21=礼服,22=外套,23=裙子,24=上衣,25=裤子,26=鞋包配饰,27=裤袜,28=鞋子,29=包包,30=配饰
     */
    private String mainCategories;

    /**
     * 客户年龄段:1=15-20,2=20-25,3=25-30,4=30-35,5=35-40,6=40-50,7=50-60,8=60以上
     */
    private String customerAge;

    /**
     * 店铺位置:1=临街,2=商场,3=市场,4=地铺
     */
    private Integer storeLocation;

    /**
     * 货源细分:1=品牌库存,2=市场货,3=厂家直批
     */
    private String sourcingSegmentation;

    /**
     * 进货渠道:1=省内批发市场,2=广东批发市场,3=杭州批发市场,4=北京批发市场,5=义务批发市场,6=互联网平台,7=其它市场
     */
    private String purchaseChannel;

    /**
     * 其它进货渠道
     */
    private String otherPurchaseChannels;

    /**
     * 意见反馈:1=物流时间可接受1-3天,2=物流时间可接受3-7天,3=质量问题,4=退换问题,5=款式不够新,6=价格高,7=价格底,8=没有喜欢的款式,9=没有合作,没有信任度,10=风格不合适,11=其他
     */
    private String feedback;

    /**
     * 标签:1=新客户,2=无意向,3=待沟通,4=已成交,5=有意向
     */
    private Integer tag;

    /**
     * 回访记录
     */
    private String remark;

    /**
     * 码数:1=XS,2=S,3=M,4=L,5=XL,6=XXL,6=XXXL,7=XXXXL
     */
    private String yardage;

    /**
     * 店铺标签:1=无效用户(电话无效(停机、空号),2=未回访,3=有意向,4=暂无意向(暂被拒绝),5=暂无意向(打通不做了),6=再回拨(没人接),7=再回拨(没打通),8=再回拨(不在服务区),9=再回拨(没信号),10=已成交(货品问题暂不愿合作),11=已成交(物流问题暂不愿合作),12=已成交(有继续进货意向),13=潜在客户
     */
    private String shopTag;

    /**
     * 是否通话成功
     */
    private Boolean isCallSuccess;

    /**
     * 微信业务号
     */
    private Integer wechatId;

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
     * 当前是否有盈利:1=是,0=否
     */
    private Boolean havaProfit;

    /**
     * 上月/本月营业额:1=10-15万,2=5-10万,3=0-5万,4=15万以上
     */
    private Integer businessTurnover;

    /**
     * 通话时长
     */
    private String telTimeLenght;

    /**
     * 拨打次数
     */
    private Integer callCount;

    /**
     * 万商身份
     */
    private String wsIdentity;

    /**
     * 万商通
     */
    private Integer wsCard;

    /**
     * 删除标识:0=否,1=是
     */
    private Boolean isDelete;


}
