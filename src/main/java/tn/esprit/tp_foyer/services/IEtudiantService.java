package tn.esprit.tp_foyer.services;

import tn.esprit.tp_foyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant) ;
    List<Etudiant> getEtudiant() ;
    Etudiant updateEtudiant(Etudiant etudiant );
    void deleteEtudiant(Long id) ;
}
