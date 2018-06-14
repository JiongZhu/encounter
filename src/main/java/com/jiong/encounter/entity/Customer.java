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
 * 顾客�?
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Customer extends Model<Customer> {

    private static final long serialVersionUID = 1L;

    /**
     * 顾客编号
     */
    private String cusNo;
    /**
     * 顾客登录密码
     */
    private String cusPass;
    /**
     * 顾客姓名
     */
    private String cusName;
    /**
     * 顾客联系电话
     */
    private String cusTel;
    /**
     * 顾客地址
     */
    private String cusAddress;

    @Override
    protected Serializable pkVal() {
        return this.cusNo;
    }

}
