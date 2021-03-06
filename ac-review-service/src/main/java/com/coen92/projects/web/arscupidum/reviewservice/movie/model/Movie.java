package com.coen92.projects.web.arscupidum.reviewservice.movie.model;

import com.coen92.projects.web.arscupidum.reviewservice.movie.MovieGenre;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Movie {

    @Id
    UUID id;

    String title;

    Director director;

    List<MovieGenre> genres;

    Set<Actor> cast;
}
