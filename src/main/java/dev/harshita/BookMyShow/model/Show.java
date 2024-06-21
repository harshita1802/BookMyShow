package dev.harshita.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @Column(name = "START_TIME")
    private Time startTime;

    @Column(name = "END_TIME")
    private Time endTime;

    @ManyToOne
    private Movie movie;
}
