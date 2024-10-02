package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.* ;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;


}
