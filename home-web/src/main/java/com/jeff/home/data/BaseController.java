package com.jeff.home.data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JeffPeng on 2017/3/6.
 */
@Controller
@RequestMapping("/home")
public class BaseController {
    @RequestMapping("")
    public String index(Model model){
        return "index";
    }
}
