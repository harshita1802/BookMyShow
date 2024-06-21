package dev.harshita.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theater extends BaseModel{

    @Column(name = "THEATER_NAME")
    private String name;

    @OneToMany
    private List<Auditorium> auditoriumList;
}
