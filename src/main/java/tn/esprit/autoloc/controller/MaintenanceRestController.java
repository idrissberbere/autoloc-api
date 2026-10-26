package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {

    private IMaintenanceService maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getMaintenances() {
        return maintenanceService.FindAll();
    }

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.AddMaintenance(maintenance);
    }

    @PutMapping("/modify-maintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.UpdateMaintenance(maintenance);
    }

    @DeleteMapping("/remove-maintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}