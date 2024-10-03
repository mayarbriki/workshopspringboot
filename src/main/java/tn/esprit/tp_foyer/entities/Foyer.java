package tn.esprit.tp_foyer.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.* ;
import lombok.* ;

import java.util.Set;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite ;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "foyer")
    private Set<Bloc> blocs ;
}
