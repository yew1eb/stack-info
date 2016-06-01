package com.yew1eb.model;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public class LoginUser {
    private Long uid;
    private String username;
    private String password;
    private String jobs;
    private String avatar;
    private int role_id;
    private int status;
    private long topics;
    private long comments;
    private long myTopics;
    private long myNodes;
    private long following;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTopics() {
        return topics;
    }

    public void setTopics(long topics) {
        this.topics = topics;
    }

    public long getComments() {
        return comments;
    }

    public void setComments(long comments) {
        this.comments = comments;
    }

    public long getMyTopics() {
        return myTopics;
    }

    public void setMyTopics(long myTopics) {
        this.myTopics = myTopics;
    }

    public long getMyNodes() {
        return myNodes;
    }

    public void setMyNodes(long myNodes) {
        this.myNodes = myNodes;
    }

    public long getFollowing() {
        return following;
    }

    public void setFollowing(long following) {
        this.following = following;
    }
}
