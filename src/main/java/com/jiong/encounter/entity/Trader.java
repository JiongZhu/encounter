package com.jiong.encounter.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 交易员表
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Trader extends Model<Trader> {

    private static final long serialVersionUID = 1L;

    /**
     * 交易员编�?
     */
    private String traNo;
    /**
     * 交易员登录密�?
     */
    private String traPass;
    /**
     * 交易员名
     */
    private String traName;
    /**
     * 交易员�?�别
     */
    private String traSex;
    /**
     * 交易员年�?
     */
    private Integer traAge;
    /**
     * 交易员联系电�?
     */
    private String traTel;
    /**
     * 交易员地�?
     */
    private String traAddress;

    @Override
    protected Serializable pkVal() {
        return this.traNo;
    }

}
