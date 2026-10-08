package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Agence;

import java.util.List;

public interface IAgenceService {

    Agence AddAgence(Agence agence);

    void deleteAgence(Long id);

    Agence UpdateAgence(Agence agence);

    List<Agence> FindAll();
}