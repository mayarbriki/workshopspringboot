package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entities.Reservation;
import tn.esprit.tp_foyer.repository.ReservationRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationrepository ;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationrepository.save(reservation);
    }

    @Override
    public List<Reservation> getReservation() {
        List<Reservation> reservations=reservationrepository.findAll();
        return reservations;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationrepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idreservation) {
        reservationrepository.deleteById(Long.valueOf(idreservation));
    }
}
