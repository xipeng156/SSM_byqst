package com.qst.demo01.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class NewsContect {
    int contentID;
    String title;
    int typeID;
    String content;
    String author;
    Date pubTime;

    public NewsContect() {
    }

    public NewsContect(String title, int typeID, String content, String author, Date pubTime) {
        this.title = title;
        this.typeID = typeID;
        this.content = content;
        this.author = author;
        this.pubTime = pubTime;
    }

    public NewsContect(int contentID, String title, int typeID, String content, String author, Date pubTime) {
        this.contentID = contentID;
        this.title = title;
        this.typeID = typeID;
        this.content = content;
        this.author = author;
        this.pubTime = pubTime;
    }
}
