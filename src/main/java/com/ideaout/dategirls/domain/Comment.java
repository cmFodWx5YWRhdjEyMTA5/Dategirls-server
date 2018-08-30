package com.ideaout.dategirls.domain;

public class Comment {
    private Long id;

    private Long userid;

    private Long dynamicsid;

    private Long timestamp;

    private String datatime;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getDynamicsid() {
        return dynamicsid;
    }

    public void setDynamicsid(Long dynamicsid) {
        this.dynamicsid = dynamicsid;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime == null ? null : datatime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}