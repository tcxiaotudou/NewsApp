package com.codedou.newsdemo.entity;

import com.codedou.newsdemo.enums.NewsType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    private String cName;

    public Category() {

    }

    public Category(String cName) {
        this.cName = cName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
