package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entities.Chambre;
import tn.esprit.tp_foyer.repository.ChambreRepository;


import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
@ToString

public class ChambreService implements IChambreService{
    @Autowired
    ChambreRepository chambreRepository ;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);

    }

    @Override
    @Scheduled(cron = "00 28 15 * * *")
    public List<Chambre> getChambre() {
        List<Chambre> chambres = chambreRepository.findAll();
        for(Chambre chambre : chambres) {
            log.info("chambre: " + chambre);
        }
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
