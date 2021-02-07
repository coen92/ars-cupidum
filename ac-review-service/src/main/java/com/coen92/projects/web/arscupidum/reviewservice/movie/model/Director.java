package com.coen92.projects.web.arscupidum.reviewservice.movie.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
class Director {

    @Id
    Integer id;

    String name;

    String surname;

    List<Movie> movies;
}
