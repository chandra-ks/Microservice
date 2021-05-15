package io.java.movieinfoservice.resources;

import io.java.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        System.out.println("in movie controller");
        return new Movie(movieId, "Business Man");
    }
}
