package com.qst.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Users {
    int userID;
    String userName;
    String UserPwd;

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
        return UserPwd;
    }

    public void setUserPwd(String userPwd) {
        UserPwd = userPwd;
    }

    public Users() {
    }

    public Users(String userName, String userPwd) {
        this.userName = userName;
        UserPwd = userPwd;
    }

    public Users(int userID, String userName, String userPwd) {
        this.userID = userID;
        this.userName = userName;
        UserPwd = userPwd;
    }
}
