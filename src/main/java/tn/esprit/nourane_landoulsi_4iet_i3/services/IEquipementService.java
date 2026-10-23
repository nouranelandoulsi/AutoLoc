package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement obj);
    Equipement getEquipementById(Long id);
    Equipement updateEquipement(Equipement obj);
    void deleteEquipementById(Long id);
    List<Equipement> getAllEquipements();
}
