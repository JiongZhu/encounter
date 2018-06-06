package com.jiong.encounter.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: JiongZhu
 * @Description:
 * @Date: Created in 23:07 2018/6/4
 * @Modified By:
 */
@Getter
@Setter
@AllArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Boolean isSuccess;
    private Integer stateCode;
    private String message;
    private T data;

    @Override
    public String toString(){
        new JSONObject();
        return JSON.toJSONString(this);
    }
}
