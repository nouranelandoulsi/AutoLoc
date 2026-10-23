package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat createContrat(Contrat obj);
    Contrat getContratById(Long id);
    Contrat updateContrat(Contrat obj);
    void deleteContratById(Long id);
    List<Contrat> getAllContrats();
}
