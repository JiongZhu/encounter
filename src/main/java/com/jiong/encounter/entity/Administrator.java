package com.jiong.encounter.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Administrator extends Model<Administrator> {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员编�?
     */
    private String admNo;
    /**
     * 管理员登录密�?
     */
    private String admPass;
    /**
     * 管理员名�?
     */
    private String admName;
    /**
     * 管理员�?�别
     */
    private String admSex;
    /**
     * 管理员年�?
     */
    private Integer admAge;
    /**
     * 管理员联系电�?
     */
    private String admTel;
    /**
     * 管理员地�?
     */
    private String admAddress;

    @Override
    protected Serializable pkVal() {
        return this.admNo;
    }

}
