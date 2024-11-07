package tn.esprit.tp_foyer.services;

import tn.esprit.tp_foyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation) ;
    List<Reservation> getReservation() ;
    Reservation updateReservation(Reservation reservation );
    void deleteReservation(String id) ;
}
