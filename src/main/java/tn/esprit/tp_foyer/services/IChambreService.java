package tn.esprit.tp_foyer.services;

import tn.esprit.tp_foyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre) ;
    List<Chambre> getChambre() ;
    Chambre updateChambre(Chambre chambre );
    void deleteChambre(Long id) ;
    Chambre retrieveChambre(Long chambreId) ;
    List<Chambre> getChambresByType(String type);
    Chambre getChambreByNumber(long number);

    }
