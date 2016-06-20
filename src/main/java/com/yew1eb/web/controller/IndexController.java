package com.yew1eb.web.controller;

import com.yew1eb.constants.FamousDay;
import com.yew1eb.constants.FamousKit;
import com.yew1eb.service.FavoriteService;
import com.yew1eb.service.NodeService;
import com.yew1eb.service.NoticeService;
import com.yew1eb.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private TopicService topicService;

    @Autowired
    private NodeService nodeService;

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private FavoriteService favoriteService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
        this.putData(request);

        String tab = request.
        return "home";
    }

    private void putData(HttpServletRequest request){
        // 读取节点列表
        List<Map<String, Object>> nodes = nodeService.getNodeList();
        request.setAttribute("nodes", nodes);

        // 每日格言
        FamousDay famousDay = FamousKit.getTodayFamous();
        // TODO Constant.VIEW_CONTEXT.set("famousDay", famousDay);
    }
}

