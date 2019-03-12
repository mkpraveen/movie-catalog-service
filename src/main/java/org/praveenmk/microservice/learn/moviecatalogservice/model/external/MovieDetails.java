package org.praveenmk.microservice.learn.moviecatalogservice.model.external;


public class MovieDetails {

    private long movieId;
    private String movieName;
    private String movieDescription;

    public MovieDetails(long movieId, String movieName, String movieDescription) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
    }

    public MovieDetails(String movieName, String movieDescription) {
        super();
        this.movieName = movieName;
        this.movieDescription = movieDescription;
    }

    public MovieDetails() {
        super();
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

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    @Override
    public String toString() {
        return "MovieDetails{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                '}';
    }
}
