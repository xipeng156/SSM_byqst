package com.qst.entity;

import com.qst.utils.StatusCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 10:44 2020/9/13
 * @Modified by:
 */
public class JsonUsers {
    StatusCode statusCode;
    ArrayList<Users> users;

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public ArrayList<Users> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }

    public JsonUsers(StatusCode statusCode, ArrayList<Users> users) {
        this.statusCode = statusCode;
        this.users = users;
    }
}
