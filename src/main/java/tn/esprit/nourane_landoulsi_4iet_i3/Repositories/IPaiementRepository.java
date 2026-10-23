package tn.esprit.nourane_landoulsi_4iet_i3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long> {
}