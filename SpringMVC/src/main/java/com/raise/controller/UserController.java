package com.raise.controller;

import com.raise.bean.UserAccount;
import com.raise.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xiangxiaolong
 * @create 2022-03-27 14:03
 */
@Controller
@RequestMapping(value = "/useraccount")
public class UserController {
    @Autowired
    private UserAccountService userAccountService;
    @RequestMapping(value = "/save",method = RequestMethod.POST,produces = "text/html;charset=utf-8")
    @ResponseBody
    public String save(UserAccount userAccount){
        userAccountService.save(userAccount);
        return "保存成功~~~~~~";
    }

    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public List<UserAccount> selectAll(){
        List<UserAccount> userAccounts = userAccountService.selectAll();
        return userAccounts;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "success";
    }
}
