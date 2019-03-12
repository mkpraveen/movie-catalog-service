package org.praveenmk.microservice.learn.moviecatalogservice.controller;

import org.praveenmk.microservice.learn.moviecatalogservice.model.MovieCatalog;
import org.praveenmk.microservice.learn.moviecatalogservice.service.MovieCatalogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogController {



    @Autowired
    private MovieCatalogServiceImpl movieCatalogServiceImpl;

    @RequestMapping(value = "/moviecatalog/movie/{movieId}", method = RequestMethod.GET)
    public MovieCatalog getMovieRatings(@PathVariable("movieId") long movieId) {
        return movieCatalogServiceImpl.getMovieCatalog(movieId);
    }

}
