package com.qst.demo01.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Users {
    public int userID;
    public String userName;
    public String userPwd;

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
