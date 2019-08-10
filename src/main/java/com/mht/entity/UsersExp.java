package com.mht.entity;

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
public class UsersExp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer usersId;

    /**
     * 经验值
     */
    private Integer exp;

    /**
     * 年龄
     */
    private Integer avg;

    private String qq;


}
