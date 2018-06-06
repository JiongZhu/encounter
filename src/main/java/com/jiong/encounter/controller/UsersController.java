package com.jiong.encounter.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.jiong.encounter.entity.Users;
import com.jiong.encounter.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UsersController {
    JSONObject jsonObject;

    @Autowired
    UsersMapper usersMapper;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getUserList() throws JsonProcessingException {
        jsonObject = new JSONObject();
        jsonObject.put("aaData", usersMapper.selectList(null));
        return jsonObject;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String createUserForm() {
        return "userList";
    }

    @RequestMapping(value = "/age",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject serverPagi(@RequestParam String aoData) throws IOException {
        JSONArray jsonarray=(JSONArray) JSONArray.parse(aoData);
        String sEcho = null;
        int iDisplayStart = 0;
        int iDisplayLength = 0;
        for (int i = 0; i < jsonarray.size(); i++) {
            jsonObject = (JSONObject) jsonarray.get(i);
            if(jsonObject.get("name").equals("sEcho"))
                sEcho = jsonObject.get("value").toString();
            if(jsonObject.get("name").equals("iDisplayStart"))
                iDisplayStart = Integer.parseInt(jsonObject.get("value").toString());
            if(jsonObject.get("name").equals("iDisplayLength"))
                iDisplayLength = Integer.parseInt(jsonObject.get("value").toString());
        }
        List<Users> usersList = usersMapper.selectPageByAge(22);
        jsonObject = new JSONObject();
        jsonObject.put("sEcho",sEcho);
        jsonObject.put("iDisplayStart",iDisplayStart);
        jsonObject.put("iDisplayLength",iDisplayLength);
        jsonObject.put("iRecordsTotal",usersList.size());
        jsonObject.put("iRecordsFiltered",usersList.size());
        jsonObject.put("aaData",usersList);
        return jsonObject;
    }

    @RequestMapping(value = "create",method = RequestMethod.GET)
    public String createUserForm(ModelMap map) {
        map.addAttribute("user",new Users());
        map.addAttribute("action","create");
        return "userForm";
    }

    @RequestMapping(value = "create",method = RequestMethod.POST)
    public String postUser(@ModelAttribute Users user) {
        usersMapper.insert(user);
        return "redirect:/users/";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable Integer id, ModelMap map) {
        map.addAttribute("user",usersMapper.selectById(id));
        map.addAttribute("action","update");
        return "userForm";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putUser(@ModelAttribute Users user) {
        usersMapper.updateById(user);
        return "redirect:/users/";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable Integer id) {
        usersMapper.deleteById(id);
        return "redirect:/users/";
    }
}
