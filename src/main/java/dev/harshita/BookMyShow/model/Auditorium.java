package dev.harshita.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{

    @Column(name = "AUDITORIUM_NAME")
    private String name;

    @OneToMany
    private List<Seat> seatList;

    @OneToMany
    private List<Show> showList;
}
