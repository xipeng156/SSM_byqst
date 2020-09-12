package com.qst.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Power {
    int pid;
    String panem;

    @Override
    public String toString() {
        return "Power{" +
                "pid=" + pid +
                ", panem='" + panem + '\'' +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPanem() {
        return panem;
    }

    public void setPanem(String panem) {
        this.panem = panem;
    }

    public Power() {
    }

    public Power(String panem) {
        this.panem = panem;
    }

    public Power(int pid, String panem) {
        this.pid = pid;
        this.panem = panem;
    }
}
