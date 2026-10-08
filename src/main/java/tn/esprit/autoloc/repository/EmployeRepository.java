package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.entite.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}