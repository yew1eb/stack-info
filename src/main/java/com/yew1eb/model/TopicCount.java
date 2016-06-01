package com.yew1eb.model;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public class TopicCount {
    private Long tid;
    private Long views;
    private Long loves;
    private Long favorites;
    private Long sinks;
    private Long comments;
    private Long c_time;

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getLoves() {
        return loves;
    }

    public void setLoves(Long loves) {
        this.loves = loves;
    }

    public Long getFavorites() {
        return favorites;
    }

    public void setFavorites(Long favorites) {
        this.favorites = favorites;
    }

    public Long getSinks() {
        return sinks;
    }

    public void setSinks(Long sinks) {
        this.sinks = sinks;
    }

    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Long getC_time() {
        return c_time;
    }

    public void setC_time(Long c_time) {
        this.c_time = c_time;
    }
}
