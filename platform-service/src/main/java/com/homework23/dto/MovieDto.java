package com.homework23.dto;

import lombok.Data;

import java.util.List;

@Data
public class MovieDto {
    private Long id;
    private String name;
    private String director;
    private String description;
    private String category;
    private List<ReviewDto> reviews;
}
