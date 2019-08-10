package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class SellerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 供货商
     */
    private Integer userId;

    /**
     * 公司名称
     */
    private String companyName;

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

    /**
     * 公司地址
     */
    private String address;

    private String companyProfile;

    /**
     * 法人代表
     */
    private String legalRepresentative;

    private String businessNum;

    private String businessImg;

    /**
     * 开户行
     */
    private String bankName;

    /**
     * 收款账号
     */
    private String bankNum;

    private String bankImg;

    /**
     * 负责人
     */
    private String name;

    /**
     * 性别:1=男,2=女
     */
    private Integer sex;

    private String department;

    private String position;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮件
     */
    private String email;

    /**
     * 联系地址
     */
    private String contactAddress;

    /**
     * 主营类目(多个用英文逗号分割)
     */
    private String subjectCategory;

    /**
     * 供应商类型:1=私营企业;2=个体工商户
     */
    private Integer type;

    /**
     * 开户姓名
     */
    private String bankUserName;

    /**
     * 企业(商户)电话
     */
    private String companyPhone;


}
