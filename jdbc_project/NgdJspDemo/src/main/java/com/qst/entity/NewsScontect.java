package com.qst.entity;


import java.sql.Date;

public class NewsScontect {
    int contentID;
    String title;
    int typeID;
    String content;
    String author;
    Date pubTime;

    public NewsScontect(int contentID, String title, int typeID, String content, String author) {
        this.contentID = contentID;
        this.title = title;
        this.typeID = typeID;
        this.content = content;
        this.author = author;
    }

    public NewsScontect(String title, int typeID, String content, String author) {
        this.title = title;
        this.typeID = typeID;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return "NewsScontect{" +
                "contentID=" + contentID +
                ", title='" + title + '\'' +
                ", typeID=" + typeID +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", pubTime=" + pubTime +
                '}';
    }

    public int getContentID() {
        return contentID;
    }

    public void setContentID(int contentID) {
        this.contentID = contentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public NewsScontect() {
    }

    public NewsScontect(String title, int typeID, String content, String author, Date pubTime) {
        this.title = title;
        this.typeID = typeID;
        this.content = content;
        this.author = author;
        this.pubTime = pubTime;
    }

    public NewsScontect(int contentID, String title, int typeID, String content, String author, Date pubTime) {
        this.contentID = contentID;
        this.title = title;
        this.typeID = typeID;
        this.content = content;
        this.author = author;
        this.pubTime = pubTime;
    }
}
