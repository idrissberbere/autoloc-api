package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Reservation;

import java.util.List;

public interface IReservationService {

    // CRUD
    Reservation AddReservation(Reservation reservation);

    void deleteReservation(Long id);

    Reservation UpdateReservation(Reservation reservation);

    List<Reservation> FindAll();

    // Contrat -> Réservation
    void affecterContratAReservation(Long idContrat, Long idReservation);

    void desaffecterContratDeReservation(Long idReservation);

    // Client -> Réservation
    void affecterClientAReservation(Long idClient, Long idReservation);
}