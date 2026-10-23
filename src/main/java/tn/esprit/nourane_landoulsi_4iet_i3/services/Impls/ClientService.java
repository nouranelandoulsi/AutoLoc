package tn.esprit.nourane_landoulsi_4iet_i3.services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Client;
import tn.esprit.nourane_landoulsi_4iet_i3.Repositories.IClientRepository;
import tn.esprit.nourane_landoulsi_4iet_i3.services.IClientService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    private final IClientRepository repository;

    @Override
    public Client createClient(Client obj) {
        return repository.save(obj);
    }

    @Override
    public Client getClientById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Client obj) {
        return repository.save(obj);
    }

    @Override
    public void deleteClientById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return repository.findAll();
    }
}
