package com.myblog.pojo;

/**
 * Created by Lucifer on 2018/6/12.
 */
public class Category {
    private String name;
    private int id;
    private int lev;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLev() {
        return lev;
    }

    public void setLev(int lev) {
        this.lev = lev;
    }
}
