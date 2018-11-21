package com.example.HIBERNATEproject.model.forms;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationForm {


    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 15)
    private String firstname;
    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 15)
    private String lastname;
    @Getter
    @Setter
    @NotBlank
    //YYYY-MM-DD
    //Do każdej adnotacji walidacyjnej możemy dodać wiadomość.
    @Pattern(regexp = "2[0-9]{3}-[0-1][0-9]-[0-3][0-9]", message = "Write data in yyyy-mm-dd format")
    private String date;
    @Getter
    @Setter
    @NotBlank

    private String adres;


    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

   /*
   //stare podejscie
   public Date getFormatedDate(){

     try {
         //YYYY-MM-DD
         return new Date(format.parse(date).getTime())
     } catch (ParseException e){
         e.printStackTrace();
     }
     return null;
     } */

    public LocalDate getFormatedDate(){
        //YYYY-MM-DD
//        return LocalDate.parse(date, format);
        return  LocalDate.parse(date,format);
    }
}
