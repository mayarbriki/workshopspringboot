package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entities.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
