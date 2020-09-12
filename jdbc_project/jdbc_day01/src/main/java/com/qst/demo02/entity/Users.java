package com.qst.demo02.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
@ToString
public class Users {
    int userID;
    String userName;
    String userPwd;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Users() {
    }

    public Users(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public Users(int userID, String userName, String userPwd) {
        this.userID = userID;
        this.userName = userName;
        this.userPwd = userPwd;
    }
}
