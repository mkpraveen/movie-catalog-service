package org.praveenmk.microservice.learn.moviecatalogservice.service;

import org.praveenmk.microservice.learn.moviecatalogservice.model.MovieCatalog;

public interface MovieCatalogService {
    MovieCatalog getMovieCatalog(long movieId);
}
