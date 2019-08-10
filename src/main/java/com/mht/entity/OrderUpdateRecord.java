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
 * 订单修改信息记录表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderUpdateRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单
     */
    private Integer orderId;

    /**
     * 图片1
     */
    private String imageName1;

    /**
     * 图片2
     */
    private String imageName2;

    /**
     * 图片3
     */
    private String imageName3;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 收件人电话
     */
    private String cellphone;

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
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    private Integer zipCode;

    /**
     * 旧收件人姓名
     */
    private String oName;

    /**
     * 旧收件人电话
     */
    private String oCellphone;

    /**
     * 旧省
     */
    private Integer oProvince;

    /**
     * 旧市
     */
    private Integer oCity;

    /**
     * 旧区
     */
    private Integer oRegion;

    /**
     * 旧地址
     */
    private String oAddress;

    /**
     * 旧邮编
     */
    private Integer oZipCode;

    /**
     * 版本号
     */
    private Integer ver;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
