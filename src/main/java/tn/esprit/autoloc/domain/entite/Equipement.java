package tn.esprit.autoloc.domain.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;


    private String libelle;



    // Plusieurs équipements peuvent appartenir à plusieurs véhicules
    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicules;

}