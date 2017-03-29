package com.jeff.home.web;

import com.jeff.home.api.model.TUserVo;
import com.jeff.home.api.service.IUserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JeffPeng on 2017/3/6.
 */
@Controller
public class BaseController {

    @Autowired
    IUserService iUserService;

    @RequestMapping("/home")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("/login")
    public String login(TUserVo tUserVo,Model model){
        tUserVo.setId(1);
        tUserVo = iUserService.login(tUserVo);
        model.addAttribute("info",tUserVo);
        return "login";
    }
}
