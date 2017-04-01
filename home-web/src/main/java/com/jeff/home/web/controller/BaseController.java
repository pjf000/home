package com.jeff.home.web.controller;

import com.jeff.home.api.model.TUserVo;
import com.jeff.home.web.service.TUserService;
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
    private TUserService tUserService;

    @RequestMapping("/home")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("/login")
    public String login(TUserVo tUserVo,Model model){
        tUserVo.setId(1);
        tUserVo = tUserService.login(tUserVo);
        model.addAttribute("info",tUserVo);
        return "index";
    }
}
