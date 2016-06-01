package com.yew1eb.web.controller;

import com.yew1eb.service.FavoriteService;
import com.yew1eb.service.NodeService;
import com.yew1eb.service.NoticeService;
import com.yew1eb.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@Controller
@RequestMapping("/")
public class IndexController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
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

