package tn.esprit.tp_foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entities.Etudiant;
import tn.esprit.tp_foyer.repository.EtudiantRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository ;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getEtudiant() {
        List<Etudiant> etudiants = etudiantRepository.findAll();
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idetudiant) {
        etudiantRepository.deleteById(idetudiant);
    }
}
