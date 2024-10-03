package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.* ;

import java.util.Set;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;
@ManyToOne
    Foyer foyer;
@OneToMany(cascade=CascadeType.ALL , mappedBy="bloc")
private Set<Chambre> chambres ;
    }