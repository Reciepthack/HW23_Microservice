package com.homework23.controller;


import com.homework23.client.MovieClient;
import com.homework23.client.ReviewClient;
import com.homework23.dto.MovieDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieClient movieClient;
    private final ReviewClient reviewClient;


    @GetMapping("movie/all")
    public List<MovieDto> findAll() {
        List<MovieDto> movies = movieClient.findAll();
        try {
            movies.forEach(movie -> movie.setReviews(
                    reviewClient.findAllByMovieId(movie.getId())));
        } catch (Exception ignored) {}
        return movies;
    }

    @GetMapping("movie/{id}")
    public MovieDto findById(@PathVariable("id") Long id) {
        MovieDto movie = movieClient.findById(id);
        movie.setReviews(reviewClient.findAllByMovieId(movie.getId()));
        return movie;
    }


    @PostMapping("admin/movie")
    public MovieDto save(@RequestBody MovieDto movieDto) {
        return movieClient.save(movieDto);
    }

    @DeleteMapping("admin/movie/{id}")
    public void delete(@PathVariable("id") Long id) {
        movieClient.delete(id);
    }
}
