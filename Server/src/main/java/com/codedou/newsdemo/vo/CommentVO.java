package com.codedou.newsdemo.vo;

import org.springframework.stereotype.Component;


public class CommentVO {

    private String userName;
    private String text;
    private String time;

    public CommentVO(String userName, String text, String time) {
        this.userName = userName;
        this.text = text;
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
