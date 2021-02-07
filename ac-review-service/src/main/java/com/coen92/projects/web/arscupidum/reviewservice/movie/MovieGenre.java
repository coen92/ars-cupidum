package com.coen92.projects.web.arscupidum.reviewservice.movie;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum MovieGenre {

    ACTION,
    ANIMATION,
    ADULT,
    ADVENTURE,
    BIOGRAPHY,
    COMEDY,
    CRIME,
    DOCUMENTARY,
    DRAMA,
    FAMILY,
    FANTASY,
    HISTORICAL,
    HORROR,
    MAGICAL_REALISM,
    MUSICAL,
    MYSTERY,
    PARANOID_FICTION,
    PHILOSOPHICAL,
    POLITICAL,
    ROMANCE,
    SAGA,
    SATIRE,
    SCIENCE_FICTION,
    SHORT,
    SOCIAL,
    SPECULATIVE,
    SPORT,
    THRILLER,
    URBAN,
    WAR,
    WESTERN,
    OTHER
}
