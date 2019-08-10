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
public class MiniUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 昵称是否为base64位编码:0=否,1=是
     */
    private Integer nicknameIsEncoder;

    /**
     * 登录凭证
     */
    private String openId;

    /**
     * 头像
     */
    private String headPortrait;

    /**
     * 手机号
     */
    private String account;

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
     * 详细地址
     */
    private String address;

    /**
     * 经营品类
     */
    private Integer category;

    /**
     * 风格
     */
    private Integer style;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最近登录时间
     */
    private LocalDateTime loginTime;


}
