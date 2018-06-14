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
 * 顾客�?求表
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Demand extends Model<Demand> {

    private static final long serialVersionUID = 1L;

    /**
     * �?求编�?
     */
    @TableId("dem_Id")
    private String demId;
    /**
     * 顾客编号
     */
    @TableField("dem_cusNo")
    private String demCusno;
    /**
     * 零件编号
     */
    @TableField("dem_partNo")
    private String demPartno;
    /**
     * �?求零件数�?*100
     */
    @TableField("dem_partQuantity")
    private Integer demPartquantity;
    /**
     * �?求零件�?�价*100
     */
    @TableField("dem_partPrice")
    private Integer demPartprice;
    /**
     * �?求提交时�?
     */
    @TableField("dem_referTime")
    private Date demRefertime;


    @Override
    protected Serializable pkVal() {
        return this.demId;
    }

}
