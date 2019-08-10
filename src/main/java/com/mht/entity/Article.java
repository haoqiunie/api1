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
 * 文章列表
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private String imageName;

    private String content;

    /**
     * 是否启用
     */
    private Boolean isUse;

    private String videoUrl;

    private String url;

    /**
     * 排序号
     */
    private Integer orderNumber;

    /**
     * 文章类型:1=文章,2=帮助,3=活动服务,4=banner,5=培训,6=首页,7=主推
     */
    private Integer articleTypeId;

    /**
     * 创建用户 
     */
    private Integer createUserId;

    /**
     * 更新用户
     */
    private Integer updateUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * banner跳转类型:1=文章,2=专题,3=商品
     */
    private Integer bannerType;

    /**
     * 跳转id
     */
    private Integer skipId;

    /**
     * 跳转专题类型:1=选款混批,2=预售,3=一元购,4=押金铺货,5=打包走份
     */
    private Integer subjectType;

    /**
     * 链接类型:1=内部链接,2=外部链接
     */
    private Integer linkType;


}
