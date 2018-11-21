package com.example.HIBERNATEproject.model.repositories;


import com.example.HIBERNATEproject.model.ReservationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


// CRUD - create, read, update, delete
@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel,Integer> {

    ReservationModel findByLastname(String name);
   List<ReservationModel> findByIdGreaterThanEqual(int id);

   List<ReservationModel> findByDateBefore(LocalDate date);
   List<ReservationModel> findByDateBetween(LocalDate date,LocalDate date1);
   List<ReservationModel> findByLastnameContaining(Character character);
    List<ReservationModel> deleteByFirstname(String name); // do pojedyńczego zamiast listy typ będzie int



}