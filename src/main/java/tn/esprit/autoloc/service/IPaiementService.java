package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement AddPaiement(Paiement paiement);

    void deletePaiement(Long id);

    Paiement UpdatePaiement(Paiement paiement);

    List<Paiement> FindAll();
}