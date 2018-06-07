package com.jiong.encounter.mapper;

import com.jiong.encounter.entity.Users;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jiongzhu
 * @since 2018-06-05
 */
public interface UsersMapper extends BaseMapper<Users> {
    List<Users> selectPageByAge(@Param("age") Integer age);
}
