package com.homework23.client;


import com.homework23.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "movie-service")
public interface MovieClient {

    @GetMapping("movie/all")
    List<MovieDto> findAll();

    @GetMapping("movie/{id}")
    MovieDto findById(@PathVariable("id") Long id);

    @PostMapping("admin/movie")
    MovieDto save(@RequestBody MovieDto movieDto);

    @DeleteMapping("admin/movie/{id}")
    void delete(@PathVariable("id") Long id);
}
