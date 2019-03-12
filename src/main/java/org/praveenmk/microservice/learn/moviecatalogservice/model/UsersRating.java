package org.praveenmk.microservice.learn.moviecatalogservice.model;

public class UsersRating {
    private long userId;
    private long ratingId;
    private String userName;
    private long ratingNumber;
    private String ratingDesc;

    public UsersRating() {
    }

    public UsersRating(long userId, long ratingId, String userName, long ratingNumber, String ratingDesc) {
        this.userId = userId;
        this.ratingId = ratingId;
        this.userName = userName;
        this.ratingNumber = ratingNumber;
        this.ratingDesc = ratingDesc;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRatingId() {
        return ratingId;
    }

    public void setRatingId(long ratingId) {
        this.ratingId = ratingId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getRatingNumber() {
        return ratingNumber;
    }

    public void setRatingNumber(long ratingNumber) {
        this.ratingNumber = ratingNumber;
    }

    public String getRatingDesc() {
        return ratingDesc;
    }

    public void setRatingDesc(String ratingDesc) {
        this.ratingDesc = ratingDesc;
    }
}
