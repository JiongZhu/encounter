package com.jiong.encounter.controller;

import com.alibaba.fastjson.JSONObject;
import com.jiong.encounter.entity.Administrator;
import com.jiong.encounter.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: JiongZhu
 * @Description:
 * @Date: Created in 12:02 2018/6/15
 * @Modified By:
 */
@Controller
public class ManageController {

    private JSONObject jsonObject;

    @Autowired
    AccommdateMapper accommdateMapper;
    @Autowired
    AdministratorMapper administratorMapper;
    @Autowired
    AdviceMapper adviceMapper;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    DemandMapper demandMapper;
    @Autowired
    PartMapper partMapper;
    @Autowired
    SupplierMapper supplierMapper;
    @Autowired
    TraderMapper traderMapper;
    @Autowired
    TransactionMapper transactionMapper;

    /* admin */
    @RequestMapping("/admin/showAll")
    @ResponseBody
    public JSONObject getAdminList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", administratorMapper.selectList(null));
        return jsonObject;
    }

    @RequestMapping("/addAdmin")
    public String addAdmin(@ModelAttribute Administrator admin){
        administratorMapper.insert(admin);
        return "";
    }

    @RequestMapping("/updateAdmin")
    public String updateAdmin(@ModelAttribute Administrator admin){
        administratorMapper.updateById(admin);
        return "";
    }

    @RequestMapping("/deleteAdmin")
    public String deleteAdmin(@PathVariable Integer id){
        administratorMapper.deleteById(id);
        return "";
    }

    /* customer */
    @RequestMapping("/customer/showAll")
    @ResponseBody
    public JSONObject getCustomerList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", customerMapper.selectList(null));
        return jsonObject;
    }

    /* supplier */
    @RequestMapping("/supplier/showAll")
    @ResponseBody
    public JSONObject getSupplierList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", supplierMapper.selectList(null));
        return jsonObject;
    }

    /* customer */
    @RequestMapping("/trader/showAll")
    @ResponseBody
    public JSONObject getTraderList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", traderMapper.selectList(null));
        return jsonObject;
    }

    /* part */
    @RequestMapping("/part/showAll")
    @ResponseBody
    public JSONObject getPartList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", partMapper.selectList(null));
        return jsonObject;
    }

    /* accommdate */
    @RequestMapping("/accommdate/showAll")
    @ResponseBody
    public JSONObject getAccommdateList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", accommdateMapper.selectList(null));
        return jsonObject;
    }

    /* advice */
    @RequestMapping("/advice/showAll")
    @ResponseBody
    public JSONObject getAdviceList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", adviceMapper.selectList(null));
        return jsonObject;
    }

    /* demand */
    @RequestMapping("/demand/showAll")
    @ResponseBody
    public JSONObject getDemandList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", demandMapper.selectList(null));
        return jsonObject;
    }

    /* transaction */
    @RequestMapping("/transaction/showAll")
    @ResponseBody
    public JSONObject getTransactionList(){
        jsonObject = new JSONObject();
        jsonObject.put("aaData", transactionMapper.selectList(null));
        return jsonObject;
    }
}
