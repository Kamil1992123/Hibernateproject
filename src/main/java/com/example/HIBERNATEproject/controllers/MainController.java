package com.example.HIBERNATEproject.controllers;


import com.example.HIBERNATEproject.model.ReservationModel;
import com.example.HIBERNATEproject.model.forms.ReservationForm;
import com.example.HIBERNATEproject.model.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
//import java.sql.Date;
import java.util.Calendar;
//import java.util.Date;

@Controller
public class MainController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index(Model model){
     /*   ReservationModel model = new ReservationModel();
        model.setAdres("Warszawa");
        model.setDate(new LocalDate((Calendar.getInstance().getTimeInMillis())));
        model.setFirstname("Mordeczka");
        model.setLastname("Ziomeczek");*/

//        reservationRepository.save(model);
        model.addAttribute("reservationForm", new ReservationForm());

        return "index";
    }


}
