package com.mht.entity;

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
public class CrmTableLabelAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 后台用户ID
     */
    private Integer adminId;

    /**
     * 店铺视图列表标签表ID
     */
    private Integer tableLabelId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
