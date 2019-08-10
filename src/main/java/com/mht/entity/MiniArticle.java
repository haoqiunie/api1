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
public class MiniArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 图片名称
     */
    private String imageName;

    /**
     * 期数
     */
    private Integer volumeOfPublication;

    /**
     * 排序号
     */
    private Integer orderNum;

    /**
     * 跳转地址
     */
    private String url;

    /**
     * 视频地址
     */
    private String videoUrl;

    /**
     * 启用:0=否,1=是
     */
    private Boolean isUse;

    /**
     * 文章类型:1=陈列搭配,2=销售技巧,3=营销宝典,4=时尚潮流,5=进店优惠,6=明星店铺,7=新品直播
     */
    private Integer type;

    /**
     * 浏览记录数
     */
    private Integer browseNum;

    /**
     * 收藏记录数
     */
    private Integer collectNum;

    /**
     * 点赞数
     */
    private Integer likeNum;

    /**
     * 风格
     */
    private String style;

    /**
     * 品名
     */
    private String productName;

    /**
     * 更新用户
     */
    private Integer updateUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建用户 
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
