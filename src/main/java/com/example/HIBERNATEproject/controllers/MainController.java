package com.example.HIBERNATEproject.controllers;


import com.example.HIBERNATEproject.model.ReservationModel;
import com.example.HIBERNATEproject.model.forms.ReservationForm;
import com.example.HIBERNATEproject.model.repositories.ReservationRepository;
import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.time.LocalDate;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
//import java.util.Date;

@Controller
public class MainController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index(Model model) {
     /*   ReservationModel model = new ReservationModel();
        model.setAdres("Warszawa");
        model.setDate(new LocalDate((Calendar.getInstance().getTimeInMillis())));
        model.setFirstname("Mordeczka");
        model.setLastname("Ziomeczek");*/

//        reservationRepository.save(model);
        model.addAttribute("reservationForm", new ReservationForm());
        model.addAttribute("reservations",reservationRepository.findAll());

        return "index";
    }

    @PostMapping("/")
    public String index(@ModelAttribute("reservationForm") @Valid ReservationForm form,
                        BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "index";
        } else {
            reservationRepository.save(new ReservationModel(form));
            return "index";
        }
    }


    @GetMapping("/test")
    @ResponseBody
    public String test() {
//        ReservationModel model = reservationRepository.;


//        return reservationRepository.findByLastname("Józefowicz").toString();
//        return  reservationRepository.findById(2).toString();
//        return reservationRepository.findByIdGreaterThanEqual(2).toString();

//        return  reservationRepository.findByDateBefore(LocalDate.of(2017,01,01)).toString();
        return reservationRepository.findByLastnameContaining('a').toString();
    }


    @Transactional
    @ResponseBody
    @GetMapping ("/delete/{firstname}")
    public String delete(@PathVariable String firstname){

        reservationRepository.deleteByFirstname(firstname).toString();

        return "Zakonczono transakcje";







    }



}
