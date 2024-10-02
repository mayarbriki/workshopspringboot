package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.* ;
@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    }