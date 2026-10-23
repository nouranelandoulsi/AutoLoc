package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation obj);
    Reservation getReservationById(Long id);
    Reservation updateReservation(Reservation obj);
    void deleteReservationById(Long id);
    List<Reservation> getAllReservations();
}
