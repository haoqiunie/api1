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
public class Lottery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 抽奖配置表id(1登录2签到3下单4分享5.浏览商品)
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 获取方式
     */
    private String name;

    /**
     * 获得次数
     */
    private Integer count;

    /**
     * 天获取上限
     */
    private Integer limitCount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
