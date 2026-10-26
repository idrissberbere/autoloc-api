package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoloc.domain.entite.Contrat;
import tn.esprit.autoloc.domain.entite.Paiement;
import tn.esprit.autoloc.repository.ContratRepository;
import tn.esprit.autoloc.repository.PaiementRepository;

import java.util.List;

@Service
public class PaiementService implements IPaiementService {

    private final PaiementRepository paiementRepository;
    private final ContratRepository contratRepository;

    public PaiementService(
            PaiementRepository paiementRepository,
            ContratRepository contratRepository) {

        this.paiementRepository = paiementRepository;
        this.contratRepository = contratRepository;
    }

    // =========================
    // CRUD
    // =========================

    @Override
    public Paiement AddPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public Paiement UpdatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> FindAll() {
        return paiementRepository.findAll();
    }

    // =========================
    // PAIEMENT -> CONTRAT
    // =========================

    @Override
    @Transactional
    public void affecterPaiementAContrat(
            Long idPaiement,
            Long idContrat) {

        Paiement paiement = paiementRepository.findById(idPaiement)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Paiement introuvable avec l'id : " + idPaiement));

        Contrat contrat = contratRepository.findById(idContrat)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Contrat introuvable avec l'id : " + idContrat));

        paiement.setContrat(contrat);

        paiementRepository.save(paiement);
    }
}