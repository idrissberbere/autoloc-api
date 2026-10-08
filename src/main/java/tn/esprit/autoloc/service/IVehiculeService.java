package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule AddVehicule(Vehicule vehicule);

    void deleteVehicule(Long id);

    Vehicule UpdateVehicule(Vehicule vehicule);

    List<Vehicule> FindAll();
}