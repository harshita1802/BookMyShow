package dev.harshita.BookMyShow.model;

import dev.harshita.BookMyShow.model.constant.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{

    @Column(name = "AUDITORIUM_NAME")
    private String name;

    private int capacity;

    @OneToMany
    private List<Seat> seatList;

    @OneToMany
    private List<Show> showList;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<AuditoriumFeature> auditoriumFeatures;
}
