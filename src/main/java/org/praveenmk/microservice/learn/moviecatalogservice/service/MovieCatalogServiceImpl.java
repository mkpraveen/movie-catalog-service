package org.praveenmk.microservice.learn.moviecatalogservice.service;

import org.praveenmk.microservice.learn.moviecatalogservice.model.MovieCatalog;
import org.praveenmk.microservice.learn.moviecatalogservice.model.external.UserDetails;
import org.praveenmk.microservice.learn.moviecatalogservice.model.external.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("movieCatalogServiceImpl")
public class MovieCatalogServiceImpl implements MovieCatalogService{

    @Autowired
    private RestTemplate restTemplate;

    public MovieCatalog getMovieCatalog(long movieId) {
        MovieCatalog movieCatalog = new MovieCatalog();
        List<UserRating> userRatings = restTemplate.getForObject("http://localhost:8083/jparating/getrating/movie/" + movieId, List.class);
        //Get movie details
        //Get user details

        //Create response

        return  movieCatalog;
    }
}
