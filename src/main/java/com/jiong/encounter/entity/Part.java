package com.jiong.encounter.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 零件信息�?
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Part extends Model<Part> {

    private static final long serialVersionUID = 1L;

    /**
     * 零件编号
     */
    private String partNo;
    /**
     * 零件�?
     */
    private String partName;
    /**
     * 重量
     */
    private Integer weight;
    /**
     * 单价
     */
    private Integer price;
    /**
     * 颜色
     */
    private String color;
    /**
     * �?�?
     */
    private String partIntro;


    @Override
    protected Serializable pkVal() {
        return this.partNo;
    }

}
