package dev.harshita.BookMyShow.model;

import dev.harshita.BookMyShow.model.constant.SeatStatus;
import dev.harshita.BookMyShow.model.constant.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private int row;
    private int col;
    @Column(name = "SEAT_NUMBER")
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;
}
