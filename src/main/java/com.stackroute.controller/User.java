//Create a annotation based Spring MVC application which has following classes:
//        UserController and user class.
//        UserController will create user object and will send user object to View Page (index) .
//        View Page Should display “Welcome <user> to stackroute”.


package com.stackroute.controller;

public class User {

    private String uname;

    public User() {
    }

    public User(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
