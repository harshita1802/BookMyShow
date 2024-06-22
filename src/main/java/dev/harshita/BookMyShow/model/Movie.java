package dev.harshita.BookMyShow.model;

import dev.harshita.BookMyShow.model.constant.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    @Column(name = "MOVIE_NAME")
    private String name;

    @ManyToMany
    private List<Actor> actors;

    private String description;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
}
