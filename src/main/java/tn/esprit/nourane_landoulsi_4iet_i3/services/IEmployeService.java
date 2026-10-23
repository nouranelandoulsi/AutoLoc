package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe createEmploye(Employe obj);
    Employe getEmployeById(Long id);
    Employe updateEmploye(Employe obj);
    void deleteEmployeById(Long id);
    List<Employe> getAllEmployes();
}
