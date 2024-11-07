package tn.esprit.tp_foyer.services;

import tn.esprit.tp_foyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc) ;
    List<Bloc> getBloc() ;
    Bloc updateBloc(Bloc bloc );
    void deleteBloc(Long id) ;
 }
