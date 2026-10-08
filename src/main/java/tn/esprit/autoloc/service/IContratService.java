package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Contrat;

import java.util.List;

public interface IContratService {

    Contrat AddContrat(Contrat contrat);

    void deleteContrat(Long id);

    Contrat UpdateContrat(Contrat contrat);

    List<Contrat> FindAll();
}