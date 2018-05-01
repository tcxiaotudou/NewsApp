package com.codedou.newsdemo.vo;

public class NewsPO {
    private String title;
    private String author;
    private String info;
    private String text;
    private String img;

    public NewsPO(String title, String author, String info, String text, String img) {
        this.title = title;
        this.author = author;
        this.info = info;
        this.text = text;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
