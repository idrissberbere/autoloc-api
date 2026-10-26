package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {

    private IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        return equipementService.FindAll();
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.AddEquipement(equipement);
    }

    @PutMapping("/modify-equipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.UpdateEquipement(equipement);
    }

    @DeleteMapping("/remove-equipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}