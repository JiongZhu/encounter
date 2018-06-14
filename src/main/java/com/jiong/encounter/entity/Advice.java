package com.jiong.encounter.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 交易建议�?
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Advice extends Model<Advice> {

    private static final long serialVersionUID = 1L;

    /**
     * 交易建议编号
     */
    @TableId("adv_Id")
    private String advId;
    /**
     * 交易员编�?
     */
    @TableField("adv_traNo")
    private String advTrano;
    /**
     * 顾客编号
     */
    @TableField("adv_cusNo")
    private String advCusno;
    /**
     * 供应商编�?
     */
    @TableField("adv_supNo")
    private String advSupno;
    /**
     * 零件编号
     */
    @TableField("adv_partNo")
    private String advPartno;
    /**
     * 交易建议零件数量*100
     */
    @TableField("adv_partQuantity")
    private Integer advPartquantity;
    /**
     * 交易建议零件总价*100
     */
    @TableField("adv_partPrice")
    private Integer advPartprice;
    @TableField("adv_completeTime")
    private Date advCompletetime;


    @Override
    protected Serializable pkVal() {
        return this.advId;
    }

}
