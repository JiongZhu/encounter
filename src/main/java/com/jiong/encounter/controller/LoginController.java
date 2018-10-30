package com.jiong.encounter.controller;

import com.alibaba.fastjson.JSONObject;
import com.jiong.encounter.entity.Administrator;
import com.jiong.encounter.mapper.AdministratorMapper;
import com.jiong.encounter.mapper.CustomerMapper;
import com.jiong.encounter.mapper.SupplierMapper;
import com.jiong.encounter.mapper.TraderMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController{
    private static final String ERROR = "用户名或密码错误";

    @Autowired
    AdministratorMapper administratorMapper;
    @Autowired
    TraderMapper traderMapper;
    @Autowired
    SupplierMapper supplierMapper;
    @Autowired
    CustomerMapper customerMapper;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("loginType")String loginType){
        JSONObject json = new JSONObject();
            switch(loginType){
                case "admin":
                    json.put("success", administratorMapper.selectById(username).getAdmPass().equals(password)?true:ERROR);break;
                case "trader": 
                    json.put("success", traderMapper.selectById(username).getTraPass().equals(password)?true:ERROR);break;
                case "supplier": 
                    json.put("success", supplierMapper.selectById(username).getSupPass().equals(password)?true:ERROR);break;
                case "customer": 
                    json.put("success", customerMapper.selectById(username).getCusPass().equals(password)?true:ERROR);break;
                default: 
                    json.put("success",ERROR);
            }
        return json.toString();
    }
}