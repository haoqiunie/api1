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
public class GoodsSubjetDayHits implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 专题ID
     */
    private Integer subjectId;

    /**
     * 商品每日点击量
     */
    private Integer goodsHits;

    /**
     * 专题每日点击量
     */
    private Integer subjectHits;

    /**
     * 商品历史点击量
     */
    private Integer goodsHistoryHits;

    /**
     * 专题历史点击量
     */
    private Integer subjectHistoryHits;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
