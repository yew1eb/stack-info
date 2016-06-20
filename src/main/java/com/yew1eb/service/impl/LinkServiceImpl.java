package com.yew1eb.service.impl;

import com.yew1eb.mapper.LinkMapper;
import com.yew1eb.model.Link;
import com.yew1eb.service.LinkService;
import com.yew1eb.util.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkMapper linkMapper;

    @Override
    public Link getLink(Long id) {
        return linkMapper.getLinkById(id);
    }

    @Override
    public List<Link> getLinkList(QueryParam queryParam) {
        if(null != queryParam){
            //return AR.find(queryParam).list(Link.class);
        }
        return null;
    }

    @Override
    public boolean save(String title, String url) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if(null != id){
           // AR.update("delete from t_link where id = ?", id).executeUpdate();
            return true;
        }
        return false;
    }
}
