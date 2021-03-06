package com.jiong.encounter.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 供应商表
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Supplier extends Model<Supplier> {

    private static final long serialVersionUID = 1L;

    /**
     * 供应商编�?
     */
    @TableId(type = IdType.INPUT)
    private String supNo;
    /**
     * 供应商登录密�?
     */
    private String supPass;
    /**
     * 供应商名
     */
    private String supName;
    /**
     * 供应商联系电�?
     */
    private String supTel;
    /**
     * 供应商地�?
     */
    private String supAddress;
    /**
     * 供应商简�?
     */
    private String supIntro;

    @Override
    protected Serializable pkVal() {
        return this.supNo;
    }

}
