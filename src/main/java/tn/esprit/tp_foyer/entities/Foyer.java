package tn.esprit.tp_foyer.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.* ;
import lombok.* ;
@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;


}
