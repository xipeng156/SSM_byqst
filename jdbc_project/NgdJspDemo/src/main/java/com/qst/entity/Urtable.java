package com.qst.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Urtable {
    int urid;
    int uid;
    int rid;

    public Urtable(int urid, int uid, int rid) {
        this.urid = urid;
        this.uid = uid;
        this.rid = rid;
    }

    public Urtable(int uid, int rid) {
        this.uid = uid;
        this.rid = rid;
    }

    public Urtable() {
    }
}
