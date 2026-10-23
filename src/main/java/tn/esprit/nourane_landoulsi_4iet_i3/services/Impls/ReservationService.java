package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Reservation;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IReservationRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IReservationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements IReservationService {

    private final IReservationRepository repository;

    @Override
    public Reservation createReservation(Reservation obj) {
        return repository.save(obj);
    }

    @Override
    public Reservation getReservationById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Reservation updateReservation(Reservation obj) {
        return repository.save(obj);
    }

    @Override
    public void deleteReservationById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return repository.findAll();
    }
}
