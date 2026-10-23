package tn.esprit.nourane_landoulsi_4iet_i3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
}