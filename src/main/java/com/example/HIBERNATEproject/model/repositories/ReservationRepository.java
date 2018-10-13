package com.example.HIBERNATEproject.model.repositories;


import com.example.HIBERNATEproject.model.ReservationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// CRUD - create, read, update, delete
@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel,Integer> {
}