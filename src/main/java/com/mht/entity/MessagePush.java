package com.mht.entity;

import java.math.BigDecimal;
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
public class MessagePush implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 推送消息
     */
    private String message;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 标题
     */
    private String title;

    /**
     * 消息类型:1=公告,2=物流信息,3=优惠券信息
     */
    private Integer type;

    /**
     * 消息类型图片
     */
    private String imageName;

    /**
     * 现金券减少金额
     */
    private BigDecimal reduceAmount;

    /**
     * 执行时间
     */
    private LocalDateTime executeTime;


}
