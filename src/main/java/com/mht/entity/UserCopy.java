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
 * 用户表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserCopy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 状态:1=未提交,2=已提交(审核中),3=审核未通过,4=用户审核通过,5=店铺审核通过
     */
    private Integer status;

    /**
     * 帐号
     */
    private String account;

    private String nickName;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 赠送余额
     */
    private BigDecimal balancePresented;

    /**
     * 密码
     */
    private String password;

    /**
     * 邀请人手机号码
     */
    private String inviteCellphone;

    /**
     * 头像
     */
    private String portraitImg;

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
     * 定位地址
     */
    private String locationAddress;

    /**
     * 商品现金券
     */
    private BigDecimal goodsCash;

    /**
     * 物流现金券
     */
    private BigDecimal logisticsCash;

    /**
     * openid
     */
    private String openid;

    /**
     * 登录IP
     */
    private String loginIp;

    /**
     * 密码错误次数
     */
    private Integer passwordError;

    /**
     * 审核人ID
     */
    private Integer auditEovaUserId;

    /**
     * 审核描述
     */
    private String auditRemark;

    /**
     * 登录时间
     */
    private LocalDateTime loginTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 审核时间
     */
    private LocalDateTime auditTime;

    /**
     * 邀请码
     */
    private String inviteNum;

    /**
     * 押金总额
     */
    private BigDecimal cashPledgeTotal;

    /**
     * 押金占用额度
     */
    private BigDecimal cashPledgeOccupy;

    /**
     * 押金可用额度
     */
    private BigDecimal cashPledgeUsable;

    /**
     * 用户身份:1=店铺,2=拓展员,3=测试,4=小程序店主,5=非店铺,6=Miranda,7=个人体验
     */
    private Integer identity;

    /**
     * unionid
     */
    private String unionid;

    /**
     * 昵称是否为base64位编码:0=否,1=是
     */
    private Integer nicknameIsEncoder;

    /**
     * 最近访问时间
     */
    private LocalDateTime recentlyVisitTime;

    /**
     * 销售人员id
     */
    private Integer userEmployeeId;

    /**
     * 兴趣标签
     */
    private String interestLabel;

    /**
     * 用户地理位置纬度
     */
    private String latitude;

    /**
     * 用户地理位置经度
     */
    private String longitude;

    /**
     * 价格区间最小值
     */
    private Integer priceMin;

    /**
     * 价格区间最大值
     */
    private Integer priceMax;

    /**
     * 兴趣类型
     */
    private String classify;

    /**
     * 兴趣风格
     */
    private String style;

    /**
     * 兴趣品类
     */
    private String category;

    /**
     * 是否设置过兴趣标签:1=是,2=否
     */
    private Integer setInterest;

    /**
     * 支付密码
     */
    private String payPassword;

    /**
     * 全部佣金
     */
    private BigDecimal totalCommission;

    /**
     * 今日佣金
     */
    private BigDecimal todaylCommission;

    /**
     * 本周签到天数
     */
    private Integer weekSignNumber;

    /**
     * 本周签到时间
     */
    private String weekSignDay;

    /**
     * 会员ID
     */
    private Integer memberId;

    /**
     * 小程序openid
     */
    private String appletOpenId;

    /**
     * 微信业务号
     */
    private Integer businessWechatId;

    /**
     * 营业执照状态:1=未提交,2=审核中,3=审核未通过,4=审核通过
     */
    private Integer businessStatus;

    /**
     * 是否开启
     */
    private Boolean isOpen;

    /**
     * 注册来源:1=web,2=android,3=ios,4=e逛街
     */
    private Integer source;

    /**
     * 客服号归属
     */
    private Integer wechatId;


}
