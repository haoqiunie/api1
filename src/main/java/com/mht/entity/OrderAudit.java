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
public class OrderAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 审核状态:1=通过,2=不通过
     */
    private Integer status;

    /**
     * 审核人
     */
    private Integer createUserId;

    /**
     * 审核时间
     */
    private LocalDateTime createTime;

    /**
     * 不通过原因
     */
    private String refuseReason;

    /**
     * 审核角色
     */
    private Integer createRole;


}
