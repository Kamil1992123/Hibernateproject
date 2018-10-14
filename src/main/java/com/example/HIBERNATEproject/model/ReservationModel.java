package com.example.HIBERNATEproject.model;

import com.example.HIBERNATEproject.model.forms.ReservationForm;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

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
    private LocalDate date;
    private String adres;

    public ReservationModel (ReservationForm form){
        firstname = form.getFirstname();
        lastname = form.getLastname();
//        date = form.getFormatedDate();
        date = form.getFormatedDate();
        adres = form.getAdres();

    }
}
