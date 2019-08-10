package com.mht.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class CrmShopBaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺拓展信息表ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店铺ID
     */
    private Integer shopId;

    /**
     * 经营状态
     */
    private Integer manageStatus;

    /**
     * 其他经营品牌
     */
    private String otherGoodsBrand;

    /**
     * 万商进货额
     */
    private String wsStockLimit;

    /**
     * 地区
     */
    private Integer district;

    /**
     * 附近网点
     */
    private String nearSite;

    /**
     * 网点电话
     */
    private String siteTel;

    /**
     * 经营模式
     */
    private Integer businessModel;

    /**
     * GDP总数据
     */
    private String gdpData;

    /**
     * 租金
     */
    private String charterMoney;

    /**
     * 县/区人口
     */
    private String peopleNum;

    /**
     * 店铺形象
     */
    private String shopVisualize;

    /**
     * 开业时间
     */
    private LocalDate businessStartTime;

    /**
     * 营业时间
     */
    private LocalDate businessTime;

    /**
     * 网点联系人
     */
    private String siteLinkman;

    /**
     * 营业额(分)
     */
    private Long turnover;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
