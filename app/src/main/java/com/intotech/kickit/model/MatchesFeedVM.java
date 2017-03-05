package com.intotech.kickit.model;


public class MatchesFeedVM {

    private String imgFirstClub;
    private String imgSecondClub;
    private String date;
    private String hour;
    private String league;
    private String nextMatch;

    public MatchesFeedVM() {
    }

    public MatchesFeedVM(String imgFirstClub, String imgSecondClub, String date, String hour, String league, String nextMatch) {
        this.imgFirstClub = imgFirstClub;
        this.imgSecondClub = imgSecondClub;
        this.date = date;
        this.hour = hour;
        this.league = league;
        this.nextMatch = nextMatch;
    }

    public String getImgFirstClub() {
        return imgFirstClub;
    }

    public void setImgFirstClub(String imgFirstClub) {
        this.imgFirstClub = imgFirstClub;
    }

    public String getImgSecondClub() {
        return imgSecondClub;
    }

    public void setImgSecondClub(String imgSecondClub) {
        this.imgSecondClub = imgSecondClub;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getNextMatch() {
        return nextMatch;
    }

    public void setNextMatch(String nextMatch) {
        this.nextMatch = nextMatch;
    }
}
