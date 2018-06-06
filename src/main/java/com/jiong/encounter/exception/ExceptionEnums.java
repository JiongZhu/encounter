package com.jiong.encounter.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: JiongZhu
 * @Description:
 * @Date: Created in 23:56 2018/6/4
 * @Modified By:
 */
@AllArgsConstructor
@Getter
public enum ExceptionEnums {
    UNKOWN_ERROR(-1,"未知错误"),
    USER_NOT_FIND(-101,"用户不存在"),
    PRIMARY_SCHOOL(100,"正在等待请求"),
    MIDDLE_SCHOOL(101,"服务器准备切换协议"),
    SUCCESS(200,"成功"),
    FAIL(400,"失败"),
    UNAUTHORIZED(401,"签名错误"),
    INSUFFICIENT_PERMISSIONS(403,"权限不足，禁止访问"),
    NOT_FOUND(404,"接口不存在"),
    INTERNAL_SERVER_ERROR(500,"服务器内部错误");

    private Integer stateCode;
    private String message;
}
