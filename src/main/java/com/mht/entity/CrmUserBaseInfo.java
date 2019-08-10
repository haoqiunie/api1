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
public class CrmUserBaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店主拓展信息表ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店主ID
     */
    private Integer userId;

    /**
     * 是否有雇员 0=没有 1=有
     */
    private Integer haveEmployee;

    /**
     * 性别 0=女 1=男
     */
    private Integer sex;

    /**
     * 语言
     */
    private String flanguage;

    /**
     * 主力语言
     */
    private String mainLanguage;

    /**
     * 从业原因
     */
    private String workingReson;

    /**
     * 专职
     */
    private String mainProfession;

    /**
     * 性格
     */
    private String fcharacter;

    /**
     * 是否注册 0=否 1=是
     */
    private Integer isRegister;

    /**
     * 是否关注公众号 0=否 1=是
     */
    private Integer isAttentionAccount;

    /**
     * 是否多店 0=否 1=是
     */
    private Integer isManyStores;

    /**
     * 谁看店 0=都看 1=店主 2=雇员
     */
    private Integer keepStore;

    /**
     * 微信号是否有效 0=否 1=是
     */
    private Integer wechatIsValid;

    /**
     * 是否微商 0=否 1=是
     */
    private Integer isMicroMerchant;

    /**
     * 从业时间
     */
    private String workingStartTime;

    /**
     * 是否下载APP 0=否 1=是
     */
    private Integer isDownloadApp;

    /**
     * 是否多类
     */
    private Integer isManyClass;

    /**
     * 是否有小孩 0=否 1=是
     */
    private Integer havaChild;

    /**
     * 是否有营业执照
     */
    private Integer havaBusinessImg;

    /**
     * 副业
     */
    private String slaveProfession;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 客服号归属
     */
    private Integer wechatId;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
