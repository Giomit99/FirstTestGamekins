package com.project.cinema.services;

import com.project.cinema.models.Movie;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieService {
    private Movie movie;

    public void someMethod() {
        if (movie != null)
            System.out.println("Doing something with movie: " + movie.getTitle());
    }
}
