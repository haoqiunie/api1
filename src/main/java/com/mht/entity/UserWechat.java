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
public class UserWechat implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 是否订阅:0=否,1=是
     */
    private Integer subscribe;

    /**
     * 用户的标识
     */
    private String openid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别:0=未知,1=男性,2=女性
     */
    private Integer sex;

    /**
     * 城市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 语言
     */
    private String language;

    /**
     * 头像
     */
    private String headimgurl;

    /**
     * 关注时间
     */
    private Integer subscribeTime;

    /**
     * unionid
     */
    private String unionid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 分组ID
     */
    private Integer groupid;

    /**
     * 标签ID列表
     */
    private String tagidList;


}
