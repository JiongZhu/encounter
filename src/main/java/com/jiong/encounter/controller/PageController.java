package com.jiong.encounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: JiongZhu
 * @Description: 异常页面、登录界面等界面映射
 * @Date: Created in 15:41 2018/6/6
 * @Modified By:
 */
@Controller
public class PageController {

    private static final String LOGIN = "login";
    private static final String UNAUTHORIZED = "401";
    private static final String INSUFFICIENT_PERMISSIONS = "403";
    private static final String PAGE_NOT_FOUND = "404";
    private static final String INTERNAL_SERVER_ERROR = "500";

    @RequestMapping("/login")
    public String Login(){
        return LOGIN;
    }

    @RequestMapping("/401")
    public String Unauthorized(){
        return UNAUTHORIZED;
    }

    @RequestMapping("/403")
    public String InsufficientPermissions(){
        return INSUFFICIENT_PERMISSIONS;
    }

    @RequestMapping("/404")
    public String PageNotFound(){
        return PAGE_NOT_FOUND;
    }

    @RequestMapping("/500")
    public String InternalServerError(){
        return INTERNAL_SERVER_ERROR;
    }
}
