package com.homework23.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String director;
    private String description;

    @Enumerated(EnumType.STRING)
    private MovieCategory category;
}
