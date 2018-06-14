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
 * 交易�?
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Transaction extends Model<Transaction> {

    private static final long serialVersionUID = 1L;

    /**
     * 交易编号
     */
    @TableId("tran_Id")
    private String tranId;
    /**
     * 交易建议编号
     */
    @TableField("adv_Id")
    private String advId;
    /**
     * 交易达成时间
     */
    @TableField("tran_completeTime")
    private Date tranCompletetime;


    @Override
    protected Serializable pkVal() {
        return this.tranId;
    }

}
