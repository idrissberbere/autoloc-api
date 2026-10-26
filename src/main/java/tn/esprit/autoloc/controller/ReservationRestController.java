package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.entite.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    private IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.FindAll();
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.AddReservation(reservation);
    }

    @PutMapping("/modify-reservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.UpdateReservation(reservation);
    }

    @DeleteMapping("/remove-reservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}