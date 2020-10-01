package com.homework23.controller;


import com.homework23.model.Movie;
import com.homework23.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping("movie/all")
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping("movie/{id}")
    public Movie findById(@PathVariable("id") Movie movie){
        return movie;
    }

    @PostMapping("admin/movie")
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @DeleteMapping("admin/movie/{id}")
    public void delete(@PathVariable("id") Movie movie) {
        movieService.delete(movie);
    }
}
