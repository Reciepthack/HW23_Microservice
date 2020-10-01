package com.homework23.service;


import com.homework23.model.Movie;
import com.homework23.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> findAll(){
        return movieRepository.findAll();
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public void delete(Movie movie){
        movieRepository.delete(movie);
    }

    public Movie findById(Long id) {
        return movieRepository.findMovieById(id);
    }
}
