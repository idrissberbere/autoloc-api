package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.entite.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}