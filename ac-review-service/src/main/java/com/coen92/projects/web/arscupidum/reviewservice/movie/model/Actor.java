package com.coen92.projects.web.arscupidum.reviewservice.movie.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
class Actor {

    @Id
    String id;

    String name;

    String surname;
}
