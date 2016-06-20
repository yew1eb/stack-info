package com.yew1eb.service;


import com.yew1eb.model.Link;
import com.yew1eb.util.QueryParam;

import java.util.List;

public interface LinkService {

    Link getLink(Long id);

    List<Link> getLinkList(QueryParam queryParam);

    boolean save(String title, String url);

    boolean delete(Integer id);

}
