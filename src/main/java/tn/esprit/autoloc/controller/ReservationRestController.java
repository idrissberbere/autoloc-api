package tn.esprit.autoloc.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.service.IReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationRestController {

    private final IReservationService reservationService;

    public ReservationRestController(
            IReservationService reservationService) {

        this.reservationService = reservationService;
    }

    // =========================
    // CONTRAT -> RESERVATION
    // =========================

    @PutMapping("/affecter-contrat/{idContrat}/{idReservation}")
    public void affecterContratAReservation(
            @PathVariable Long idContrat,
            @PathVariable Long idReservation) {

        reservationService.affecterContratAReservation(
                idContrat,
                idReservation
        );
    }

    @PutMapping("/desaffecter-contrat/{idReservation}")
    public void desaffecterContratDeReservation(
            @PathVariable Long idReservation) {

        reservationService.desaffecterContratDeReservation(
                idReservation
        );
    }

    // =========================
    // CLIENT -> RESERVATION
    // =========================

    @PutMapping("/affecter-client/{idClient}/{idReservation}")
    public void affecterClientAReservation(
            @PathVariable Long idClient,
            @PathVariable Long idReservation) {

        reservationService.affecterClientAReservation(
                idClient,
                idReservation
        );
    }
}