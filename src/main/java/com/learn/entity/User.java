package com.learn.entity;

public class User {
    private Integer id;
    private String username;
    private String pwd;

    // 构造方法、getter和setter
    public User() {}

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String toString() {
        return "User [id=" + id + ", username=" + username + ", pwd=" + pwd + "]";
    }
}