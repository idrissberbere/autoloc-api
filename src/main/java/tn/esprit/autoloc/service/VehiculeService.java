package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoloc.domain.entite.Agence;
import tn.esprit.autoloc.domain.entite.Equipement;
import tn.esprit.autoloc.domain.entite.Vehicule;
import tn.esprit.autoloc.repository.AgenceRepository;
import tn.esprit.autoloc.repository.EquipementRepository;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.util.List;

@Service
public class VehiculeService implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;
    private final AgenceRepository agenceRepository;
    private final EquipementRepository equipementRepository;

    public VehiculeService(
            VehiculeRepository vehiculeRepository,
            AgenceRepository agenceRepository,
            EquipementRepository equipementRepository) {

        this.vehiculeRepository = vehiculeRepository;
        this.agenceRepository = agenceRepository;
        this.equipementRepository = equipementRepository;
    }

    // =========================
    // CRUD
    // =========================

    @Override
    public Vehicule AddVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> FindAll() {
        return vehiculeRepository.findAll();
    }


    @Override
    @Transactional
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Agence agence = agenceRepository.findById(idAgence).get();
        vehicule.setAgence(agence);
        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void desaffecterVehiculeDAgence(Long idVehicule) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        vehicule.setAgence(null);
        vehiculeRepository.save(vehicule);
    }

    // =========================
    // EQUIPEMENT -> VEHICULE
    // =========================

    @Override
    @Transactional
    public void affecterEquipementAVehicule(Long idEquipement, Long idVehicule) {

        Equipement equipement = equipementRepository.findById(idEquipement).get();

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();

        vehicule.getEquipements().add(equipement);

        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule) {

        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() ->
                        new RuntimeException("Équipement introuvable avec l'id : " + idEquipement));

        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() ->
                        new RuntimeException("Véhicule introuvable avec l'id : " + idVehicule));

        vehicule.getEquipements().remove(equipement);

        vehiculeRepository.save(vehicule);
    }
}