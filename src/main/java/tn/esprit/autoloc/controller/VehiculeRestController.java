package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {

    private IVehiculeService vehiculeService;

    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getVehicules() {
        return vehiculeService.FindAll();
    }

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.AddVehicule(vehicule);
    }

    @PutMapping("/modify-vehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.UpdateVehicule(vehicule);
    }

    @DeleteMapping("/remove-vehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}