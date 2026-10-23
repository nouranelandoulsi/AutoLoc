package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence obj);
    Agence getAgenceById(Long id);
    Agence updateAgence(Agence obj);
    void deleteAgenceById(Long id);
    List<Agence> getAllAgences();
}
