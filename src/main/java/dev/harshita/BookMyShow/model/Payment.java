package dev.harshita.BookMyShow.model;

import dev.harshita.BookMyShow.model.constant.PaymentMode;
import dev.harshita.BookMyShow.model.constant.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private LocalDateTime paymentDateTime;
    private double amount;
    private String referenceId;

    @ManyToOne
    private Ticket ticket;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
