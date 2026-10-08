package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance AddMaintenance(Maintenance maintenance);

    void deleteMaintenance(Long id);

    Maintenance UpdateMaintenance(Maintenance maintenance);

    List<Maintenance> FindAll();
}