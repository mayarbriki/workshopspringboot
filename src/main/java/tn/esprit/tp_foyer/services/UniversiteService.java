package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entities.Universite;
import tn.esprit.tp_foyer.repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository ;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getUniversite() {
        List<Universite> universites = universiteRepository.findAll();
        return universites;
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }
}
