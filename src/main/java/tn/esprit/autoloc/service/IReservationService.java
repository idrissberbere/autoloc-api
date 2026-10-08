package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.entite.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation AddReservation(Reservation reservation);

    void deleteReservation(Long id);

    Reservation UpdateReservation(Reservation reservation);

    List<Reservation> FindAll();
}