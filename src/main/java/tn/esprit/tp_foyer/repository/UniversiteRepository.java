package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
