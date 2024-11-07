package tn.esprit.tp_foyer.services;

import tn.esprit.tp_foyer.entities.Bloc;
import tn.esprit.tp_foyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer) ;
    List<Foyer> getFoyer() ;
    Foyer updateFoyer(Foyer foyer );
    void deleteFoyer(Long id) ;
}
