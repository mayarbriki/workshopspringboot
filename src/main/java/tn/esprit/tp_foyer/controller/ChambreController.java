package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entities.Chambre;
import tn.esprit.tp_foyer.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService;

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.getChambre();
        return listChambres;
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.deleteChambre(chId);
    }
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }
    @GetMapping("/filter-by-type/{type}")
    public List<Chambre> getChambresByType(@PathVariable String type) {
        return chambreService.getChambresByType(type);
    }
    @GetMapping("/find-by-number/{number}")
    public Chambre getChambreByNumber(@PathVariable int number) {
        return chambreService.getChambreByNumber(number);
    }
    @PutMapping("/{idChambre}/assign-bloc/{idBloc}")
    public ResponseEntity<Chambre> assignChambreToBloc(@PathVariable Long idChambre, @PathVariable Long idBloc) {
        Chambre updatedChambre = chambreService.assignChambreToFoyer(idChambre, idBloc);
        return new ResponseEntity<>(updatedChambre, HttpStatus.OK);
    }
}