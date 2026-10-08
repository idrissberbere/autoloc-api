package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Employe;

import java.util.List;

public interface IEmployeService {

    Employe AddEmploye(Employe employe);

    void deleteEmploye(Long id);

    Employe UpdateEmploye(Employe employe);

    List<Employe> FindAll();
}