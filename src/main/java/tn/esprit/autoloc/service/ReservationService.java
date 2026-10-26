package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoloc.domain.entite.Client;
import tn.esprit.autoloc.domain.entite.Contrat;
import tn.esprit.autoloc.domain.entite.Reservation;
import tn.esprit.autoloc.repository.ClientRepository;
import tn.esprit.autoloc.repository.ContratRepository;
import tn.esprit.autoloc.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService implements IReservationService {

    private final ReservationRepository reservationRepository;
    private final ContratRepository contratRepository;
    private final ClientRepository clientRepository;

    public ReservationService(
            ReservationRepository reservationRepository,
            ContratRepository contratRepository,
            ClientRepository clientRepository) {

        this.reservationRepository = reservationRepository;
        this.contratRepository = contratRepository;
        this.clientRepository = clientRepository;
    }

    // =========================
    // CRUD
    // =========================

    @Override
    public Reservation AddReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> FindAll() {
        return reservationRepository.findAll();
    }

    // =========================
    // CONTRAT -> RESERVATION
    // =========================

    @Override
    @Transactional
    public void affecterContratAReservation(Long idContrat, Long idReservation) {

        Contrat contrat = contratRepository.findById(idContrat).get();


        Reservation reservation = reservationRepository.findById(idReservation).get();

        reservation.setContrat(contrat);

        reservationRepository.save(reservation);
    }

    @Override
    @Transactional
    public void desaffecterContratDeReservation(Long idReservation) {

        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Réservation introuvable avec l'id : " + idReservation));

        reservation.setContrat(null);

        reservationRepository.save(reservation);
    }

    // =========================
    // CLIENT -> RESERVATION
    // =========================

    @Override
    @Transactional
    public void affecterClientAReservation(
            Long idClient,
            Long idReservation) {

        Client client = clientRepository.findById(idClient)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Client introuvable avec l'id : " + idClient));

        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Réservation introuvable avec l'id : " + idReservation));

        reservation.setClient(client);

        reservationRepository.save(reservation);
    }
}