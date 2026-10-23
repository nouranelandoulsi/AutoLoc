package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Contrat;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IContratRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IContratService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratService implements IContratService {

    private final IContratRepository repository;

    @Override
    public Contrat createContrat(Contrat obj) {
        return repository.save(obj);
    }

    @Override
    public Contrat getContratById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Contrat updateContrat(Contrat obj) {
        return repository.save(obj);
    }

    @Override
    public void deleteContratById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return repository.findAll();
    }
}
