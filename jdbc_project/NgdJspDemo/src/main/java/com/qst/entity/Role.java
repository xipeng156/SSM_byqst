package com.qst.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Role {
    int rid;
    String rname;

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Role(String rname) {
        this.rname = rname;
    }

    public Role() {
    }

    public Role(int rid, String rname) {
        this.rid = rid;
        this.rname = rname;
    }
}
