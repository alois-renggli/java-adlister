package com.codeup.adlister.dao;

public class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    public String getUsername() {
        return "adlister_user";
    }
    public String getPassword() {
        return "password";
    }
}


