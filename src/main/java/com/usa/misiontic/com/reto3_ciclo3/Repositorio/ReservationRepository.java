package com.usa.misiontic.com.reto3_ciclo3.Repositorio;

import com.usa.misiontic.com.reto3_ciclo3.CrudRepository.ReservationCrudRepository;
import com.usa.misiontic.com.reto3_ciclo3.Modelo.Client;
import com.usa.misiontic.com.reto3_ciclo3.Modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();

    }

    public Optional<Reservation> getReservation(int id){
        return reservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation r){
        return reservationCrudRepository.save(r);
    }

    public void delete(Reservation r){
        reservationCrudRepository.delete(r);
    }


}
