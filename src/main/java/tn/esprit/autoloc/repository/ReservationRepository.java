package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.entite.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}