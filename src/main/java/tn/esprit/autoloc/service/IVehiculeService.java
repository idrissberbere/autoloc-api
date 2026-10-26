package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Vehicule;

import java.util.List;

public interface IVehiculeService {

    // CRUD
    Vehicule AddVehicule(Vehicule vehicule);

    void deleteVehicule(Long id);

    Vehicule UpdateVehicule(Vehicule vehicule);

    List<Vehicule> FindAll();

    // Affectation véhicule - agence
    void affecterVehiculeAAgence(Long idVehicule, Long idAgence);

    void desaffecterVehiculeDAgence(Long idVehicule);

    // Affectation équipement - véhicule
    void affecterEquipementAVehicule(Long idEquipement, Long idVehicule);

    void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule);
}