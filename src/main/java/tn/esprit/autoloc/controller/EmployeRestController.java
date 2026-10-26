package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {

    private IEmployeService employeService;

    @GetMapping("/retrieve-all-employes")
    public List<Employe> getEmployes() {
        return employeService.FindAll();
    }

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.AddEmploye(employe);
    }

    @PutMapping("/modify-employe")
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.UpdateEmploye(employe);
    }

    @DeleteMapping("/remove-employe/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}