package it.project.cinema.app;

import it.project.cinema.models.Movie;
import it.project.cinema.services.MovieService;

public class CinemaApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 2010);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994);

        MovieService movieService = new MovieService();
        movieService.setMovie(movie1);

        // Ciclo
        movie1.setMovieService(movieService);
        movie1.doSomething();
        //

        System.out.println("All Movies: ");
        System.out.println(movie1);
        System.out.println(movie2);
    }
}

/*
public class CinemaApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 2010);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994);

        MovieService movieService = new MovieService();
        movieService.setMovie(movie1);

        System.out.println("All Movies:");
        System.out.println(movie1);
        System.out.println(movie2);
    }
}
*/
