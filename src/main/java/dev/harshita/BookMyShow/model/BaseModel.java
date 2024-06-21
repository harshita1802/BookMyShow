package dev.harshita.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {

    @Id  //makes the attribute primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id; //primary key

}
