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
public class ShopVisit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 回访方式:1=电话,2=微信,3=QQ,4=邮件
     */
    private Integer visitWay;

    /**
     * 拿货方式
     */
    private String shoppingWay;

    /**
     * 拿货频率
     */
    private String shoppingRate;

    /**
     * 价格
     */
    private String price;

    /**
     * 类型
     */
    private String type;

    /**
     * 风格标签
     */
    private String label;

    /**
     * 年龄段
     */
    private String ageAng;

    /**
     * 回访情况
     */
    private String visitCondition;

    /**
     * 意向等级：1=已成交,2=有意向,3=观望,4=没兴趣
     */
    private Integer intentionGrade;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 操作人
     */
    private Integer createUserId;

    /**
     * 店铺ID
     */
    private Integer shopId;

    /**
     * 是否通话成功
     */
    private Boolean isCallSuccess;


}
