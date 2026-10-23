package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Equipement;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IEquipementRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IEquipementService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService implements IEquipementService {

    private final IEquipementRepository repository;

    @Override
    public Equipement createEquipement(Equipement obj) {
        return repository.save(obj);
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Equipement updateEquipement(Equipement obj) {
        return repository.save(obj);
    }

    @Override
    public void deleteEquipementById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return repository.findAll();
    }
}
