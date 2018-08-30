package com.ideaout.dategirls.domain;

public class Follow {
    private Long id;

    private Long followedUserid;

    private Long followUserid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFollowedUserid() {
        return followedUserid;
    }

    public void setFollowedUserid(Long followedUserid) {
        this.followedUserid = followedUserid;
    }

    public Long getFollowUserid() {
        return followUserid;
    }

    public void setFollowUserid(Long followUserid) {
        this.followUserid = followUserid;
    }
}