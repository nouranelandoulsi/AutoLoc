package tn.esprit.nourane_landoulsi_4iet_i3.services;

import tn.esprit.nourane_landoulsi_4iet_i3.Domain.Client;

import java.util.List;

public interface IClientService {
    Client createClient(Client obj);
    Client getClientById(Long id);
    Client updateClient(Client obj);
    void deleteClientById(Long id);
    List<Client> getAllClients();
}
