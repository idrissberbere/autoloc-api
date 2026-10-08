package tn.esprit.autoloc.domain.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;


    private String nom;

    private String prenom;


    @Enumerated(EnumType.STRING)
    private RoleEmploye role;



    // Plusieurs employés travaillent dans une agence
    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;

}