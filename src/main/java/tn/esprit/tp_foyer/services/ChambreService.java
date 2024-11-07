package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entities.Chambre;
import tn.esprit.tp_foyer.repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository ;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);

    }

    @Override
    public List<Chambre> getChambre() {
        List<Chambre> chambres = chambreRepository.findAll();
        return chambres;
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idbloc) {
        chambreRepository.deleteById(idbloc);
    }
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
}
