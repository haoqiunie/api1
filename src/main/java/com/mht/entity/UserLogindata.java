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
 * 用户登陆信息表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserLogindata implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 登录时间
     */
    private LocalDateTime loginTime;

    /**
     * 用户身份:1=店铺,2=拓展员,3=测试,4=小程序店主,5=非店铺,6=Miranda,7=个人体验
     */
    private Integer identity;

    /**
     * 店铺名称
     */
    private String name;

    private String nickName;

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
     * 登录时间
     */
    private String dataDate;


}
