package dev.harshita.BookMyShow.model;

import dev.harshita.BookMyShow.model.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    private LocalDateTime timeOfBooking;
    @OneToMany
    private List<ShowSeat> seatsBooked;

    private double totalAmount;

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;


}
