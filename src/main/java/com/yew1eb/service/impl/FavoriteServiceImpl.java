package com.yew1eb.service.impl;

import com.yew1eb.mapper.FavoriteMapper;
import com.yew1eb.service.*;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private TopicService topicService;

    @Autowired
    private UserService userService;

    @Autowired
    private NodeService nodeService;

    @Autowired
    private TopicCountService topicCountService;

    @Autowired
    private FavoriteMapper favoriteMapper;

    @Override
    public boolean isFavorite(String type, Long uid, Long eventId) {
        if (!StringUtils.hasLength(type) || null == uid || null == eventId) {
            return false;
        }
        Long count = favoriteMapper.getCount(type, uid, eventId);
        return (count == null || count == 0) ? false : true;
    }

    @Override
    public Long favorites(String type, Long uid) {
        if (null != uid && !StringUtils.hasLength(type)) {
            return favoriteMapper.getCount(type, uid);
        }
        return 0L;
    }

    // TODO watting ...
    @Override
    public Page<Map<String, Object>> getMyTopics(Long uid, Integer page, Integer count) {
        if (null != uid) {
            if (null == page || page < 1) {
                page = 1;
            }

            if (null == count || count < 1) {
                count = 10;
            }
/*
            QueryParam queryParam = QueryParam.me();
            queryParam.eq("type", Types.topic.toString()).eq("uid", uid).orderby("id desc").page(page, count);
            Page<Favorite> faPage = this.getPageList(queryParam);
            if (null != faPage && faPage.getTotalCount() > 0) {
                long totalCount = faPage.getTotalCount();
                int page_ = faPage.getPage();
                int pageSize = faPage.getPageSize();
                Page<Map<String, Object>> result = new Page<Map<String, Object>>(totalCount, page_, pageSize);

                List<Favorite> favorites = faPage.getResults();

                List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
                if (null != favorites && favorites.size() > 0) {
                    for (Favorite favorite : favorites) {
                        Long tid = favorite.getEvent_id();
                        Topic topic = topicService.getTopic(tid);
                        Map<String, Object> topicMap = topicService.getTopicMap(topic, false);
                        if (null != topicMap && !topicMap.isEmpty()) {
                            list.add(topicMap);
                        }
                    }
                }
                result.setResults(list);

                return result;
            }
*/
        }

        return null;
    }

    @Override
    public Page<Map<String, Object>> getFollowing(Long uid, Integer page, Integer count) {
        if (null != uid) {
            if (null == page || page < 1) {
                page = 1;
            }
            if (null == count || count < 1) {
                count = 10;
            }
/*
            QueryParam queryParam = QueryParam.me();
            queryParam.eq("type", Types.following.toString()).eq("uid", uid).orderby("id desc").page(page, count);
            Page<Favorite> faPage = this.getPageList(queryParam);
            if (null != faPage && faPage.getTotalCount() > 0) {
                long totalCount = faPage.getTotalCount();
                int page_ = faPage.getPage();
                int pageSize = faPage.getPageSize();
                Page<Map<String, Object>> result = new Page<Map<String, Object>>(totalCount, page_, pageSize);

                List<Favorite> favorites = faPage.getResults();

                List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
                if (null != favorites && favorites.size() > 0) {
                    for (Favorite favorite : favorites) {
                        Long user_id = favorite.getEvent_id();
                        Map<String, Object> userMap = userService.getUserDetail(user_id);
                        if (null != userMap && !userMap.isEmpty()) {
                            list.add(userMap);
                        }
                    }
                }
                result.setResults(list);
                return result;
            }
*/
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> getMyNodes(Long uid) {
        /*
        if (null != uid) {
            QueryParam queryParam = QueryParam.me();
            queryParam.eq("type", Types.node.toString()).eq("uid", uid).orderby("id desc");
            List<Favorite> favorites = AR.find(queryParam).list(Favorite.class);
            if (null != favorites && favorites.size() > 0) {
                List<Map<String, Object>> result = new ArrayList<Map<String, Object>>(favorites.size());
                for (Favorite favorite : favorites) {
                    Long nid = favorite.getEvent_id();
                    Map<String, Object> node = nodeService.getNodeDetail(null, nid);
                    result.add(node);
                }
                return result;
            }
        }
        */
        return null;
    }

    @Override
    public Integer update(String type, Long uid, Long eventId) {
        /*
        try {
            int count = 0;
            boolean isFavorite = this.isFavorite(type, uid, event_id);
            if (!isFavorite) {
                AR.update("insert into t_favorite(type, uid, event_id, create_time) values(?, ?, ?, ?)",
                        type, uid, event_id, DateKit.getCurrentUnixTime()).executeUpdate();
                count = 1;
            } else {
                AR.update("delete from t_favorite where type = ? and uid = ? and event_id = ?", type, uid, event_id).executeUpdate();
                count = -1;
            }

            // 收藏帖子
            if (type.equals(Types.topic.toString())) {
                topicCountService.update(Types.favorites.toString(), event_id, count);
                topicService.updateWeight(event_id);
            }

            // 帖子点赞
            if (type.equals(Types.love.toString())) {
                topicCountService.update(Types.loves.toString(), event_id, count);
                topicService.updateWeight(event_id);
            }

            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        return 0;
    }

}
