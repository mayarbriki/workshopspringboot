package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entities.Bloc;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    List<Bloc> findByFoyerIsNull();
    List<Bloc> findByCapaciteBlocGreaterThan(Long capaciteBloc);
    public List<Bloc> findByNomBlocStartingWith(String nomBloc);
    List<Bloc> findByNomBlocStartingWithAndCapaciteBlocGreaterThan(String prefix, int capacity);

}
