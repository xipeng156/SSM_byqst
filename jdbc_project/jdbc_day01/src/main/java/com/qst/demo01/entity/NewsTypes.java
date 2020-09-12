package com.qst.demo01.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NewsTypes {
    int typeID;
    String typeName;

    public NewsTypes(int typeID, String typeName) {
        this.typeID = typeID;
        this.typeName = typeName;
    }

    public NewsTypes() {
    }

    public NewsTypes(String typeName) {
        this.typeName = typeName;
    }

}
