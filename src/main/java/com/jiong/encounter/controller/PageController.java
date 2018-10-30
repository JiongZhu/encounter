package com.jiong.encounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: JiongZhu
 * @Description: 异常页面、登录界面、管理主界面等界面映射
 * @Date: Created in 15:41 2018/6/6
 * @Modified By:
 */
@Controller
public class PageController {

    private static final String LOGIN = "login";
    private static final String ADMIN_INDEX = "admin";
    private static final String TRADER_INDEX = "trader";
    private static final String SUPPLIER_INDEX = "supplier";
    private static final String CUSTOMER_INDEX = "customer";
    private static final String UNAUTHORIZED = "401";
    private static final String INSUFFICIENT_PERMISSIONS = "403";
    private static final String PAGE_NOT_FOUND = "404";
    private static final String INTERNAL_SERVER_ERROR = "500";

    private static final String ADMIN_MANAGE_ACCOMMDATE = "admin/manageAccommdate";
    private static final String ADMIN_MANAGE_ADMIN = "admin/manageAdmin";
    private static final String ADMIN_MANAGE_ADVICE = "admin/manageAdvice";
    private static final String ADMIN_MANAGE_CUSTOMER = "admin/manageCustomer";
    private static final String ADMIN_MANAGE_DEMAND = "admin/manageDemand";
    private static final String ADMIN_MANAGE_PART = "admin/managePart";
    private static final String ADMIN_MANAGE_SUPPLIER = "admin/manageSupplier";
    private static final String ADMIN_MANAGE_TRADER = "admin/manageTrader";
    private static final String ADMIN_MANAGE_TRANSACTION = "admin/manageTransaction";

    private static final String CUSTOMER_MANAGE_ADVICE = "customer/manageAdvice";
    private static final String CUSTOMER_MANAGE_DEMAND = "customer/manageDemand";
    private static final String CUSTOMER_MANAGE_TRANSACTION = "customer/manageTransaction";

    private static final String SUPPLIER_MANAGE_ACCOMMDATE = "supplier/manageAccommdate";
    private static final String SUPPLIER_MANAGE_ADVICE = "supplier/manageAdvice";
    private static final String SUPPLIER_MANAGE_TRANSACTION = "supplier/manageTransaction";

    private static final String TRADER_MANAGE_ACCOMMDATE = "trader/manageAccommdate";
    private static final String TRADER_MANAGE_ADVICE = "trader/manageAdvice";
    private static final String TRADER_MANAGE_DEMAND = "trader/manageDemand";
    private static final String TRADER_MANAGE_TRANSACTION = "trader/manageTransaction";

    @RequestMapping("/login")
    public String Login(){
        return LOGIN;
    }

    @RequestMapping("/admin")
    public String AdminIndex(){
        return ADMIN_INDEX;
    }

    @RequestMapping("/trader")
    public String TraderIndex(){
        return TRADER_INDEX;
    }

    @RequestMapping("/supplier")
    public String SupplierIndex(){
        return SUPPLIER_INDEX;
    }

    @RequestMapping("/customer")
    public String CustomerIndex(){
        return CUSTOMER_INDEX;
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

    @RequestMapping("/admin/manageAccommdate")
    public String AdminManageAccommdate(){
        return ADMIN_MANAGE_ACCOMMDATE;
    }

    @RequestMapping("/admin/manageAdmin")
    public String AdminManageAdmin(){
        return ADMIN_MANAGE_ADMIN;
    }

    @RequestMapping("/admin/manageAdvice")
    public String AdminManageAdvice(){
        return ADMIN_MANAGE_ADVICE;
    }

    @RequestMapping("/admin/manageCustomer")
    public String AdminManageCustomer(){
        return ADMIN_MANAGE_CUSTOMER;
    }

    @RequestMapping("/admin/manageDemand")
    public String AdminManageDemand(){
        return ADMIN_MANAGE_DEMAND;
    }

    @RequestMapping("/admin/managePart")
    public String AdminManagePart(){
        return ADMIN_MANAGE_PART;
    }

    @RequestMapping("/admin/manageSupplier")
    public String AdminManageSupplier(){
        return ADMIN_MANAGE_SUPPLIER;
    }

    @RequestMapping("/admin/manageTrader")
    public String AdminManageTrader(){
        return ADMIN_MANAGE_TRADER;
    }

    @RequestMapping("/admin/manageTransaction")
    public String AdminManageTransaction(){
        return ADMIN_MANAGE_TRANSACTION;
    }

    @RequestMapping("/customer/manageAdvice")
    public String CustomerManageAdvice(){
        return CUSTOMER_MANAGE_ADVICE;
    }

    @RequestMapping("/customer/manageDemand")
    public String CustomerManageDemand(){
        return CUSTOMER_MANAGE_DEMAND;
    }

    @RequestMapping("/customer/manageTransaction")
    public String CustomerManageTransaction(){
        return CUSTOMER_MANAGE_TRANSACTION;
    }

    @RequestMapping("/supplier/manageAccommdate")
    public String SupplierManageAccommdate(){
        return SUPPLIER_MANAGE_ACCOMMDATE;
    }

    @RequestMapping("/supplier/manageAdvice")
    public String SupplierManageAdvice(){
        return SUPPLIER_MANAGE_ADVICE;
    }

    @RequestMapping("/supplier/manageTransaction")
    public String SupplierManageTransaction(){
        return SUPPLIER_MANAGE_TRANSACTION;
    }

    @RequestMapping("/trader/manageAccommdate")
    public String TraderManageAccommdate(){
        return TRADER_MANAGE_ACCOMMDATE;
    }

    @RequestMapping("/trader/manageAdvice")
    public String TraderManageAdvice(){
        return TRADER_MANAGE_ADVICE;
    }

    @RequestMapping("/trader/manageDemand")
    public String TraderManageDemand(){
        return TRADER_MANAGE_DEMAND;
    }

    @RequestMapping("/trader/manageTransaction")
    public String TraderManageTransaction(){
        return TRADER_MANAGE_TRANSACTION;
    }

}
