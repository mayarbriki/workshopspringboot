package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entities.Foyer;
import tn.esprit.tp_foyer.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {

    private final IFoyerService foyerService;

    @PostMapping("/add")
    public ResponseEntity<Foyer> addFoyer(@RequestBody Foyer foyer) {
        Foyer createdFoyer = foyerService.addFoyer(foyer);
        return new ResponseEntity<>(createdFoyer, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Foyer>> getAllFoyers() {
        List<Foyer> foyers = foyerService.getFoyer();
        return new ResponseEntity<>(foyers, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Foyer> updateFoyer(@RequestBody Foyer foyer) {
        Foyer updatedFoyer = foyerService.updateFoyer(foyer);
        return new ResponseEntity<>(updatedFoyer, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idFoyer}")
    public ResponseEntity<Void> deleteFoyer(@PathVariable Long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
