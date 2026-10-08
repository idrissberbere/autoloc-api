package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.entite.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}