package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class UserMemberIntegral implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 会员ID
     */
    private Integer memberId;

    /**
     * 来源:1=新用户注册,2=完善资料,3=首单赠送,4=消费赠送,5=优惠券兑换使用
     */
    private Integer source;

    /**
     * 进出标志:1=收入,2=支出
     */
    private Integer dcFlag;

    /**
     * 创建时间
     */
    private LocalDate createTime;


}
