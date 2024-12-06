package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_foyer.entities.Chambre;
import tn.esprit.tp_foyer.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long >
{
    Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> findByTypeC(TypeChambre typeC);}
