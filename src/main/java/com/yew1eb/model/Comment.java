package com.yew1eb.model;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public class Comment {
    private Long cid;
    private Long uid;
    private Long toUid;
    private Long tid;
    private String content;
    private String device;
    private Long cTime;

    public Comment() {}
    public Comment(Long uid, Long toUid, Long tid, String content, String device, Long cTime) {
        this.uid = uid;
        this.toUid = toUid;
        this.tid = tid;
        this.content = content;
        this.device = device;
        this.cTime = cTime;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getToUid() {
        return toUid;
    }

    public void setToUid(Long toUid) {
        this.toUid = toUid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Long getcTime() {
        return cTime;
    }

    public void setcTime(Long cTime) {
        this.cTime = cTime;
    }
}
