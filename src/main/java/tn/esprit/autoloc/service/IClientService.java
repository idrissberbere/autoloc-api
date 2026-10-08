package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Client;

import java.util.List;

public interface IClientService {

    Client AddClient(Client client);

    void deleteClient(Long id);

    Client UpdateClient(Client client);

    List<Client> FindAll();
}