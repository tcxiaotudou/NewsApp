package com.codedou.newsdemo.vo;


public class NewsVo {

    private Integer id;
    private Integer cid;
    private String  author;
    private String title;
    private String info;
    private String img;
    private long  time;
    private String timeformat;
    private String text;
    private int zan;

    public NewsVo() {
    }

    public NewsVo(Integer id, Integer cid, String author, String title, String info, String img, long time, String timeformat, String text, int zan) {
        this.id = id;
        this.cid = cid;
        this.author = author;
        this.title = title;
        this.info = info;
        this.img = img;
        this.time = time;
        this.timeformat = timeformat;
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

    public String getTimeformat() {
        return timeformat;
    }

    public void setTimeformat(String timeformat) {
        this.timeformat = timeformat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getZan() {
        return zan;
    }

    public void setZan(int zan) {
        this.zan = zan;
    }

    @Override
    public String toString() {
        return "NewsVo{" +
                "id=" + id +
                ", cid=" + cid +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                ", img='" + img + '\'' +
                ", time=" + time +
                ", timeformat='" + timeformat + '\'' +
                ", text='" + text + '\'' +
                ", zan=" + zan +
                '}';
    }
}
