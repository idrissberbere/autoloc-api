package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.entite.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client AddClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client UpdateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> FindAll() {
        return clientRepository.findAll();
    }
}