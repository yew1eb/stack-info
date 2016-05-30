package com.yew1eb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, ModelMap map) {
        map.addAttribute("name", name);
        return "index";
    }
}

