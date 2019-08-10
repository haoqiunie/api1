package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@FieldNameConstants(prefix = "COLUMN_")
public class UserSeller1 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 供应商编码
     */
    private String code;

    /**
     * 状态:1=未提交,2=审核中,3=审核不通过,4=审核通过
     */
    private Integer status;

    /**
     * 是否控货
     */
    private Boolean isControlGoods;

    /**
     * 账号
     */
    private String account;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 保证金
     */
    private BigDecimal cashDeposit;

    private String withdrawPwd;

    private String eovaPassword;

    private String password;

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

    private String openid;

    private String loginIp;

    /**
     * 密码错误次数
     */
    private Integer passwordError;

    /**
     * 审核人
     */
    private Integer auditEovaUserId;

    private String auditRemark;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 最近访问时间
     */
    private Date recentlyVisitTime;

    /**
     * 买手ID
     */
    private Integer buyerId;

    /**
     * 合同模板
     */
    private String contract;

    /**
     * 结算方式:1=现结
     */
    private Integer clearing;

    /**
     * 起批量
     */
    private Integer batchNum;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 起批量生效规则:1=满足其一,2=全部满足
     */
    private Integer batchRule;


}
