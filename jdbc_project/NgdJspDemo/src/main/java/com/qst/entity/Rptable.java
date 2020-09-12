package com.qst.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rptable {
    int rpid;
    int pid;
    int rid;

    public Rptable() {
    }

    public Rptable(int pid, int rid) {
        this.pid = pid;
        this.rid = rid;
    }

    public Rptable(int rpid, int pid, int rid) {
        this.rpid = rpid;
        this.pid = pid;
        this.rid = rid;
    }
}
