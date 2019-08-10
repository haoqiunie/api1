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
 * 用户信息
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 冗余角色ID
     */
    private Integer rid;

    /**
     * 状态
     */
    private Integer status;

    private String nickname;

    private String companyName;

    private String mobile;

    private String phone;

    private String phone2;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;

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
     * 管理省
     */
    private Integer adminProvince;

    /**
     * 管理市
     */
    private Integer adminCity;

    /**
     * 管理区
     */
    private Integer adminRegion;


}
