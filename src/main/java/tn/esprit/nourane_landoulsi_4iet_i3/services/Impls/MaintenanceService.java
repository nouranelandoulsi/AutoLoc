package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Maintenance;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IMaintenanceRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IMaintenanceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceService implements IMaintenanceService {

    private final IMaintenanceRepository repository;

    @Override
    public Maintenance createMaintenance(Maintenance obj) {
        return repository.save(obj);
    }

    @Override
    public Maintenance getMaintenanceById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance obj) {
        return repository.save(obj);
    }

    @Override
    public void deleteMaintenanceById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return repository.findAll();
    }
}
