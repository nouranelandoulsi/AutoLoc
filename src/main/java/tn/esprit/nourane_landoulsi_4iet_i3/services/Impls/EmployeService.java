package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Employe;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IEmployeRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IEmployeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService implements IEmployeService {

    private final IEmployeRepository repository;

    @Override
    public Employe createEmploye(Employe obj) {
        return repository.save(obj);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employe updateEmploye(Employe obj) {
        return repository.save(obj);
    }

    @Override
    public void deleteEmployeById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return repository.findAll();
    }
}
