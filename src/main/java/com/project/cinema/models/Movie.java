package com.project.cinema.models;

import lombok.Getter;
import lombok.Setter;

/*
@Setter
@Getter
public class Movie {
    private String title;
    private int year;

    public Movie(String pTitle, int pYear){
        title = pTitle;
        year = pYear;
    }

    @Override
    public String toString() {
        return "Movie{ title= '" + title + "', year= " + year + " }";
    }

    //Ciclo
    private MovieService movieService;
    public void doSomething() {
        if (movieService != null)
            movieService.someMethod();
    }
    //
}
*/
@Getter
@Setter
public class Movie {
    private String title;
    private int year;

    public Movie(String pTitle, int pYear){
        title = pTitle;
        year = pYear;
    }

    @Override
    public String toString() {
        return "Movie{ title= '" + title + "', year= " + year + " }";
    }
}
