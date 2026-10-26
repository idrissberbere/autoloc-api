package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {

    private IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        return paiementService.FindAll();
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.AddPaiement(paiement);
    }

    @PutMapping("/modify-paiement")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementService.UpdatePaiement(paiement);
    }

    @DeleteMapping("/remove-paiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}