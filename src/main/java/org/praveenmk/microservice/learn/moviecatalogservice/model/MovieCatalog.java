package org.praveenmk.microservice.learn.moviecatalogservice.model;

import java.util.List;

public class MovieCatalog {

    private long movieId;

    private String movieName;
    private String movieDesc;

    private List<UsersRating> usersRating;

    public MovieCatalog() {
    }

    public MovieCatalog(long movieId, String movieName, String movieDesc) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public List<UsersRating> getUsersRating() {
        return usersRating;
    }

    public void setUsersRating(List<UsersRating> usersRating) {
        this.usersRating = usersRating;
    }
}
