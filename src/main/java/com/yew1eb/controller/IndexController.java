package com.yew1eb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "https://github.com/yew1eb");
        return "index";
    }
}

