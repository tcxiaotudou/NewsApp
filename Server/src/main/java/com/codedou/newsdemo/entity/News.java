package com.codedou.newsdemo.entity;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class News  {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer cid;
    private String  author;
    private String title;
    private String info;
    private String img;
    @Column(length = 64)
    private long time;
    @Lob
    private String text;
    private int zan;

    public News() {
    }

    public News(Integer cid, String author, String title, String info, String img, long time, String text, Integer zan) {
        this.cid = cid;
        this.author = author;
        this.title = title;
        this.info = info;
        this.img = img;
        this.time = time;
        this.text = text;
        this.zan = zan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", cid=" + cid +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                ", img='" + img + '\'' +
                ", time=" + time +
                ", text='" + text + '\'' +
                ", zan=" + zan +
                '}';
    }
}
