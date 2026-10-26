package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {

    private IAgenceService agenceService;

    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences() {
        return agenceService.FindAll();
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.AddAgence(agence);
    }

    @PutMapping("/modify-agence")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.UpdateAgence(agence);
    }

    @DeleteMapping("/remove-agence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }
}