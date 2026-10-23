package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance createMaintenance(Maintenance obj);
    Maintenance getMaintenanceById(Long id);
    Maintenance updateMaintenance(Maintenance obj);
    void deleteMaintenanceById(Long id);
    List<Maintenance> getAllMaintenances();
}
