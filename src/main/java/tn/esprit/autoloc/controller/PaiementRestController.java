package tn.esprit.autoloc.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.service.IPaiementService;

@RestController
@RequestMapping("/paiement")
public class PaiementRestController {

    private final IPaiementService paiementService;

    public PaiementRestController(IPaiementService paiementService) {
        this.paiementService = paiementService;
    }

    // =========================
    // PAIEMENT -> CONTRAT
    // =========================

    @PutMapping("/affecter-contrat/{idPaiement}/{idContrat}")
    public void affecterPaiementAContrat(
            @PathVariable Long idPaiement,
            @PathVariable Long idContrat) {

        paiementService.affecterPaiementAContrat(
                idPaiement,
                idContrat
        );
    }
}