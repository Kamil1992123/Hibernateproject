package com.example.HIBERNATEproject.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "reservations")
@NoArgsConstructor
public class ReservationModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Column (name = "firstname")
    private String firstname;
    private String lastname;
    private Date date;
    private String adres;
}
