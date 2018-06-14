package com.jiong.encounter.controller;

import com.jiong.encounter.mapper.AdministratorMapper;
import com.jiong.encounter.mapper.CustomerMapper;
import com.jiong.encounter.mapper.SupplierMapper;
import com.jiong.encounter.mapper.TraderMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController{

    private static final String LOGIN = "login";
    private static final String LOGINTYPE_ADMIN = "admin";
    private static final String LOGINTYPE_TRADER = "trader";
    private static final String LOGINTYPE_SUPPLIER = "supplier";
    private static final String LOGINTYPE_CUSTOMER = "customer";
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
    public String login(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("loginType")String loginType){
            switch(loginType){
                case LOGINTYPE_ADMIN: return administratorMapper.selectById(username).getAdmPass().equals(password)?LOGINTYPE_ADMIN:ERROR;
                case LOGINTYPE_TRADER: return traderMapper.selectById(username).getTraPass().equals(password)?LOGINTYPE_TRADER:ERROR;
                case LOGINTYPE_SUPPLIER: return supplierMapper.selectById(username).getSupPass().equals(password)?LOGINTYPE_SUPPLIER:ERROR;
                case LOGINTYPE_CUSTOMER: return customerMapper.selectById(username).getCusPass().equals(password)?LOGINTYPE_CUSTOMER:ERROR;
                default: return ERROR;
            }
    }
}