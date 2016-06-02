package com.yew1eb.model;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public class ActiveCode {
    private Long id;
    private Long uid;
    private String code;
    private String type;
    private Integer isUse;
    private Long eTime;
    private Long cTime;

    public ActiveCode() {
    }

    public ActiveCode(Long uid, String code, String type, Long eTime, Long cTime) {
        this.uid = uid;
        this.code = code;
        this.type = type;
        this.eTime = eTime;
        this.cTime = cTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Long geteTime() {
        return eTime;
    }

    public void seteTime(Long eTime) {
        this.eTime = eTime;
    }

    public Long getcTime() {
        return cTime;
    }

    public void setcTime(Long cTime) {
        this.cTime = cTime;
    }

    public String toString() {
        return "ActiveCode [id=" + id + ", uid=" + uid + ", code=" + code + ", type=" + type + ", isUse=" + isUse
                + ", expries_time=" + eTime + ", create_time=" + cTime + "]";
    }
}
