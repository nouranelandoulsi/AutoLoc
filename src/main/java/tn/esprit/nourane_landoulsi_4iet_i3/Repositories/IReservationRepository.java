package tn.esprit.nourane_landoulsi_4iet_i3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}