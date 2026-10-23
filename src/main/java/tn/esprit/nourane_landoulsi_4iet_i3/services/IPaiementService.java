package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement obj);
    Paiement getPaiementById(Long id);
    Paiement updatePaiement(Paiement obj);
    void deletePaiementById(Long id);
    List<Paiement> getAllPaiements();
}
