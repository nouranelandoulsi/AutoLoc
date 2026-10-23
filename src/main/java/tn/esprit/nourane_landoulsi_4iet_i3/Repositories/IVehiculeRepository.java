package tn.esprit.nourane_landoulsi_4iet_i3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
    Vehicule findFirstByMarque(String marque);
}