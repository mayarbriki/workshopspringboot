package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.*;
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;


}