package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Paiement;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IPaiementRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IPaiementService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementService implements IPaiementService {

    private final IPaiementRepository repository;

    @Override
    public Paiement createPaiement(Paiement obj) {
        return repository.save(obj);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Paiement updatePaiement(Paiement obj) {
        return repository.save(obj);
    }

    @Override
    public void deletePaiementById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return repository.findAll();
    }
}
