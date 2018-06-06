package com.jiong.encounter.unit;

import com.jiong.encounter.entity.Result;
import com.jiong.encounter.exception.ExceptionEnums;

/**
 * @Author: JiongZhu
 * @Description: 返回在已知的范围内的异常信息
 * @Date: Created in 23:27 2018/6/4
 * @Modified By:
 */
public class ResultUtil {

    /**
     * @Author: JiongZhu
     * @param:  * @param message
     * @Description: 设置失败消息
     * @Date: 23:32 2018/6/4
     */
    public static Result returnFailReuslt(ExceptionEnums exceptionEnum){
        return new Result(false,exceptionEnum.getStateCode(),exceptionEnum.getMessage(),null);
    }

    /**
     * @Author: JiongZhu
     * @param:  * @param message
     * @Description: 设置失败消息
     * @Date: 23:32 2018/6/4
     */
    public static Result returnFailReuslt(String message){
        return new Result(false,200,message,null);
    }

    /**
     * @Author: JiongZhu
     * @param:  * @param stateCode
     * * @param message
     * @Description: 自定义错误信息
     * @Date: 23:32 2018/6/4
     */
    public static Result returnFailReuslt(Integer stateCode,String message){
        return new Result(false,stateCode,message,null);
    }
    /**
     * @Author: JiongZhu
     * @param:  * @param entity
     * @Description: 返回实体
     * @Date: 23:36 2018/6/4
     */
    public static Result returnEntityReuslt(Object entity){
        return new Result(true,200,null,null);
    }

    /**
     * @Author: JiongZhu
     * @param:  * @param
     * @Description: 设置403权限不足
     * @Date: 23:38 2018/6/4
     */
    public static Result returnForbiddenResult(){
        return new Result(false,403,"权限不足!! 禁止访问!!",null);
    }

    /**
     * @Author: JiongZhu
     * @param:  * @param message
     * @Description: 返回成功消息
     * @Date: 23:39 2018/6/4
     */
    public static Result returnSuccessResult(String message){
        return new Result(true,200,message,null);
    }

    /**
     * @Author: JiongZhu
     * @param:
     * @Description: 提供给部分不需要出參的接口
     * @Date: 23:39 2018/6/4
     */
    public static Result returnSuccessResult(){
        return returnSuccessResult(null);
    }
}
