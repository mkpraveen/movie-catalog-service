package org.praveenmk.microservice.learn.moviecatalogservice.service;

import java.util.ArrayList;

import org.praveenmk.microservice.learn.moviecatalogservice.model.MovieCatalog;
import org.praveenmk.microservice.learn.moviecatalogservice.model.UsersRating;
import org.praveenmk.microservice.learn.moviecatalogservice.model.external.MovieDetails;
import org.praveenmk.microservice.learn.moviecatalogservice.model.external.UserDetails;
import org.praveenmk.microservice.learn.moviecatalogservice.model.external.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("movieCatalogServiceImpl")
public class MovieCatalogServiceImpl implements MovieCatalogService{

    @Autowired
    private RestTemplate restTemplate;

	public MovieCatalog getMovieCatalog(long movieId) {
		MovieCatalog movieCatalog = new MovieCatalog();

		// Get movie details
		MovieDetails movieDetails = restTemplate
				.getForObject("http://movie-details-service/jpamovies/" + movieId, MovieDetails.class);
		movieCatalog.setMovieId(movieId);
		movieCatalog.setMovieDesc(movieDetails.getMovieDescription());
		movieCatalog.setMovieName(movieDetails.getMovieName());
		movieCatalog.setUsersRating(new ArrayList<UsersRating>());

		//Get user rating for the movie
		UserRating[] userRatings = restTemplate.getForObject(
				"http://rating-details-service/jparating/getrating/movie/" + movieId, UserRating[].class);

		// Create response
		for(UserRating userRating:userRatings) {
			
			UsersRating usersRating = new UsersRating();
			usersRating.setRatingId(usersRating.getRatingId());
			usersRating.setRatingNumber(userRating.getRatingNumber());
			usersRating.setRatingDesc(userRating.getRatingComments());
		
			//Get user details
			UserDetails userDetails = restTemplate.getForObject("http://user-details-service/jpausers/" + userRating.getUserId(), UserDetails.class);
			usersRating.setUserName(userDetails.getUserName() + " / " + userDetails.getEmailAddress());
			usersRating.setUserId(userDetails.getUserId());
			
			movieCatalog.getUsersRating().add(usersRating);
			
		}
		return movieCatalog;
	}
}
