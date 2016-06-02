package com.yew1eb.service.impl;

import com.yew1eb.model.Link;
import com.yew1eb.service.LinkService;
import com.yew1eb.util.QueryParam;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class LinkServiceImpl implements LinkService {
    @Override
    public Link getLink(Integer id) {
        return null;
    }

    @Override
    public List<Link> getLinkList(QueryParam queryParam) {
        return null;
    }

    @Override
    public boolean save(String title, String url) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
