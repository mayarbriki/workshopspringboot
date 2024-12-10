package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entities.Bloc;
import tn.esprit.tp_foyer.entities.Chambre;
import tn.esprit.tp_foyer.entities.Foyer;
import tn.esprit.tp_foyer.repository.BlocRepository;
import tn.esprit.tp_foyer.repository.ChambreRepository;
import tn.esprit.tp_foyer.repository.FoyerRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
    private final ChambreRepository chambreRepository;
    private final BlocRepository blocRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> getFoyer() {
        List<Foyer> foyers = foyerRepository.findAll();
        return null;
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);

    }

    @Override
    public void deleteFoyer(Long idfoyer) {
        foyerRepository.deleteById(idfoyer);
    }


}
