package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    private IContratService contratService;

    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats() {
        return contratService.FindAll();
    }

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.AddContrat(contrat);
    }

    @PutMapping("/modify-contrat")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.UpdateContrat(contrat);
    }

    @DeleteMapping("/remove-contrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }
}