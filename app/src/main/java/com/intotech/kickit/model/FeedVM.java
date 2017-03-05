package com.intotech.kickit.model;


public class FeedVM {

    private String tag;
    private String hour;
    private String description;
    private String imgUrl;

    public FeedVM(String tag, String hour, String description, String imgUrl) {
        this.tag = tag;
        this.hour = hour;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
