package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entities.Bloc;
import tn.esprit.tp_foyer.repository.BlocRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements IBlocService{
BlocRepository blocrepository ;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocrepository.save(bloc);
    }

    @Override
    public List<Bloc> getBloc() {
        List<Bloc> blocs = blocrepository.findAll();
        return blocs;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocrepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocrepository.deleteById(idBloc);
    }
    @Override
    public List<Bloc> getUnassignedBlocs() {
        return blocrepository.findByFoyerIsNull(); // Assuming "foyer" is a nullable relation in Bloc.
    }

    @Override
    public List<Bloc> getBlocsByCapacity(Long capacity) {
        return blocrepository.findByCapaciteBlocGreaterThan(capacity);
    }

    @Override
    public List<Bloc> getBlocsByNomStartingWith(String nomBloc) {
        return blocrepository.findByNomBlocStartingWith(nomBloc);
    }

    @Override
    public List<Bloc> getBlocsByNameAndCapacity(String prefix, int minCapacity) {
        return blocrepository.findByNomBlocStartingWithAndCapaciteBlocGreaterThan(prefix, minCapacity);    }


}
