package com.yew1eb.service.impl;

import com.yew1eb.model.Node;
import com.yew1eb.service.NodeService;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class NodeServiceImpl implements NodeService {
    @Override
    public Node getNode(Long nid) {
        return null;
    }

    @Override
    public Node getNode(QueryParam queryParam) {
        return null;
    }

    @Override
    public Map<String, Object> getNodeDetail(Node node, Long nid) {
        return null;
    }

    @Override
    public List<Node> getNodeList(QueryParam queryParam) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getNodeList() {
        return null;
    }

    @Override
    public Page<Map<String, Object>> getPageList(QueryParam queryParam) {
        return null;
    }

    @Override
    public boolean save(Long pid, String title, String description, String slug, String node_pic) {
        return false;
    }

    @Override
    public boolean delete(Long nid) {
        return false;
    }

    @Override
    public boolean updateCount(Long nid, String type, int count) {
        return false;
    }

    @Override
    public boolean update(Long nid, Long pid, String title, String description, String node_slug, String node_pic) {
        return false;
    }
}
