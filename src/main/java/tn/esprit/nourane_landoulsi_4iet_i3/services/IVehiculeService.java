package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    Vehicule getVehiculeByName(String name);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehiculeById(Long id);
    List<Vehicule> getAllVehicules();
    Vehicule findVehiculeByName(String name);

}
