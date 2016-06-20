package com.yew1eb.service.impl;

import com.yew1eb.model.Node;
import com.yew1eb.service.NodeService;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
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
        //Node node = AR.findById(Node.class, nid);
        //if(null != node && node.getIs_del() == 0){
        //   return node;
        // }
        return null;
    }

    @Override
    public Node getNode(QueryParam queryParam) {
        //return AR.find(queryParam).first(Node.class);
        return null;
    }

    @Override
    public Map<String, Object> getNodeDetail(Node node, Long nid) {
        return null;
    }

    @Override
    public List<Node> getNodeList(QueryParam queryParam) {
        if (null != queryParam) {
            // return AR.find(queryParam).list(Node.class);
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> getNodeList() {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        QueryParam np = QueryParam.me();
        np.eq("is_del", 0).eq("pid", 0).orderby("topics desc");
        List<Node> parents = this.getNodeList(np);
        for (Node node : parents) {
            Map<String, Object> nodeMap = this.getNodeDetail(node, null);
            if (null != nodeMap && !nodeMap.isEmpty()) {
                QueryParam cp = QueryParam.me();
                cp.eq("is_del", 0).eq("pid", node.getNid()).orderby("topics desc");
                List<Node> nodes = this.getNodeList(cp);
                if (!CollectionUtils.isEmpty(nodes)) {
                    List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
                    for (Node item : nodes) {
                        Map<String, Object> itemMap = this.getNodeDetail(item, null);
                        if (null != itemMap && !itemMap.isEmpty()) {
                            items.add(itemMap);
                        }
                    }
                    nodeMap.put("items", items);
                }
                result.add(nodeMap);
            }
        }
        return result;
    }

    @Override
    public Page<Map<String, Object>> getPageList(QueryParam queryParam) {
        if (null != queryParam) {
            //Page<Node> nodePage = AR.find(queryParam).page(Node.class);
            //return this.getNodePageMap(nodePage);
        }
        return null;
    }

    @Override
    public boolean save(Long pid, String title, String description, String slug, String node_pic) {
        try {
            //Integer time = DateKit.getCurrentUnixTime();
            //AR.update("insert into t_node(pid, title, description, slug, pic, create_time, update_time) values (?, ?, ?, ?, ?, ?, ?)",
            //       pid, title, description, slug, node_pic, time, time).executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Long nid) {
        if(null != nid){
          //  AR.update("update t_node set is_del = 1 where nid = ?", nid).executeUpdate(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCount(Long nid, String type, int count) {
       /* if(null != nid && StringKit.isNotBlank(type)){
            try {
                String sql = "update t_node set %s = (%s + ?) where nid = ?";
                AR.update(String.format(sql, type, type), count, nid).executeUpdate();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        */return false;
    }

    @Override
    public boolean update(Long nid, Long pid, String title, String description, String node_slug, String node_pic) {
        /*
        	try {
			if(null == nid){
				return false;
			}

			StringBuffer updateSql = new StringBuffer("update t_node set update_time = ? ");
			List<Object> params = new ArrayList<Object>();
			params.add(DateKit.getCurrentUnixTime());

			if(null != pid){
				updateSql.append(", pid = ?");
				params.add(pid);
			}
			if(null != title){
				updateSql.append(", title = ?");
				params.add(title);
			}
			if(null != description){
				updateSql.append(", description = ?");
				params.add(description);
			}
			if(null != node_slug){
				updateSql.append(", slug = ?");
				params.add(node_slug);
			}

			File file = new File(node_pic);
			if(file.exists()){
				String ext = FileKit.getExtension(file.getName());
				if(StringKit.isBlank(ext)){
					ext = "png";
				}

				String key = "node/" + node_slug + "/" + StringKit.getRandomChar(4) + "/" + StringKit.getRandomNumber(4) + "." + ext;

				boolean flag = QiniuKit.upload(file, key);
				if(flag){
					updateSql.append(", pic = ?");
					params.add(key);
				}
			}

			updateSql.append(" where nid = ?");
			params.add(nid);

			AR.update(updateSql.toString(), params.toArray()).executeUpdate();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
         */
        return false;
    }
}
