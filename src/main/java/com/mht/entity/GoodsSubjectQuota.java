package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class GoodsSubjectQuota implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 限购数量
     */
    private Integer num;

    /**
     * 限购用户状态
     */
    private Integer userStatus;

    /**
     * 限购会员等级
     */
    private Integer memberLevel;

    /**
     * 是否限购首单
     */
    private Integer isFirstOrder;

    /**
     * 限购描述
     */
    private String describe;


}
