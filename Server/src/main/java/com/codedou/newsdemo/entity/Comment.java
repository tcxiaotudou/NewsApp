package com.codedou.newsdemo.entity;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer nid;
    private Integer uid;
    @Lob
    private String text;
    @Column(length = 64)
    private long time;

    public Comment() {
    }

    public Comment(Integer nid, Integer uid, String text, long time) {
        this.nid = nid;
        this.uid = uid;
        this.text = text;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
