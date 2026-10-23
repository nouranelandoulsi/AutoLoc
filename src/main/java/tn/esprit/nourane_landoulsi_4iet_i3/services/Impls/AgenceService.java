package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Agence;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IAgenceRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IAgenceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceService implements IAgenceService {

    private final IAgenceRepository repository;

    @Override
    public Agence createAgence(Agence obj) {
        return repository.save(obj);
    }

    @Override
    public Agence getAgenceById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Agence updateAgence(Agence obj) {
        return repository.save(obj);
    }

    @Override
    public void deleteAgenceById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Agence> getAllAgences() {
        return repository.findAll();
    }
}
