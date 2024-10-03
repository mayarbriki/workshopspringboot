package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.* ;

import java.util.Date;
import java.util.Set;

@Entity
public class Reservation {
    @Id
    private String idReservation ;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

 @ManyToMany(mappedBy = "reservations" , cascade=CascadeType.ALL)
    private Set<Etudiant> etudiants ;
}
