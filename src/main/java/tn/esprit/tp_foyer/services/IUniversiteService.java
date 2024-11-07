package tn.esprit.tp_foyer.services;

import tn.esprit.tp_foyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite) ;
    List<Universite> getUniversite() ;
    Universite updateUniversite(Universite universite );
    void deleteUniversite(Long id) ;
}
