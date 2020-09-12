package com.qst.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class NewsType {
    int typeID;
    String typeName;

    @Override
    public String toString() {
        return "NewsType{" +
                "typeID=" + typeID +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public NewsType() {
    }

    public NewsType(int typeID, String typeName) {
        this.typeID = typeID;
        this.typeName = typeName;
    }

    public NewsType(String typeName) {
        this.typeName = typeName;
    }
}
