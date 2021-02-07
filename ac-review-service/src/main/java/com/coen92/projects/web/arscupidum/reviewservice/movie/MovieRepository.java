package com.coen92.projects.web.arscupidum.reviewservice.movie;

import com.coen92.projects.web.arscupidum.reviewservice.movie.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MovieRepository extends CrudRepository<Movie, UUID> {

}
