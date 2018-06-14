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
 * 供应商供应零件表
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Accommdate extends Model<Accommdate> {

    private static final long serialVersionUID = 1L;

    /**
     * 供应编号
     */
    @TableId("acc_Id")
    private String accId;
    /**
     * 供应商编�?
     */
    @TableField("acc_supNo")
    private String accSupno;
    /**
     * 零件编号
     */
    @TableField("acc_partNo")
    private String accPartno;
    /**
     * 交易零件数量*100
     */
    @TableField("acc_partQuantity")
    private Integer accPartquantity;
    /**
     * 交易零件总价*100
     */
    @TableField("acc_partPrice")
    private Integer accPartprice;
    /**
     * 供应提交时间
     */
    @TableField("acc_referTime")
    private Date accRefertime;


    @Override
    protected Serializable pkVal() {
        return this.accId;
    }

}
