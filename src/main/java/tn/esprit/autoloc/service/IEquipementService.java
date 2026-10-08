package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement AddEquipement(Equipement equipement);

    void deleteEquipement(Long id);

    Equipement UpdateEquipement(Equipement equipement);

    List<Equipement> FindAll();
}