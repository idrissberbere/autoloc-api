package tn.esprit.autoloc.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.service.IVehiculeService;

@RestController
@RequestMapping("/vehicule")
public class VehiculeRestController {

    private final IVehiculeService vehiculeService;

    public VehiculeRestController(IVehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }


    @PutMapping("/affecter-agence/{idVehicule}/{idAgence}")
    public void affecterVehiculeAAgence(
            @PathVariable Long idVehicule,
            @PathVariable Long idAgence) {

        vehiculeService.affecterVehiculeAAgence(
                idVehicule,
                idAgence
        );
    }

    @PutMapping("/desaffecter-agence/{idVehicule}")
    public void desaffecterVehiculeDAgence(
            @PathVariable Long idVehicule) {

        vehiculeService.desaffecterVehiculeDAgence(idVehicule);
    }



    @PutMapping("/affecter-equipement/{idEquipement}/{idVehicule}")
    public void affecterEquipementAVehicule(@PathVariable Long idEquipement, @PathVariable Long idVehicule) {
        vehiculeService.affecterEquipementAVehicule(idEquipement, idVehicule);
    }

    @PutMapping("/desaffecter-equipement/{idEquipement}/{idVehicule}")
    public void desaffecterEquipementDeVehicule(@PathVariable Long idEquipement, @PathVariable Long idVehicule) {
        vehiculeService.desaffecterEquipementDeVehicule(idEquipement, idVehicule);
    }
}