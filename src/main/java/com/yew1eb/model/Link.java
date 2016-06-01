package com.yew1eb.model;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public class Link {
    private Long id;
    private String title;
    private String url;
    private Long cTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getcTime() {
        return cTime;
    }

    public void setcTime(Long cTime) {
        this.cTime = cTime;
    }
}
