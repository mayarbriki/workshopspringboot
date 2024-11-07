package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entities.Universite;
import tn.esprit.tp_foyer.services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    private final IUniversiteService universiteService;

    // Create a new Universite
    @PostMapping("/add")
    public ResponseEntity<Universite> addUniversite(@RequestBody Universite universite) {
        Universite createdUniversite = universiteService.addUniversite(universite);
        return new ResponseEntity<>(createdUniversite, HttpStatus.CREATED);
    }

    // Retrieve all Universites
    @GetMapping("/all")
    public ResponseEntity<List<Universite>> getAllUniversites() {
        List<Universite> universites = universiteService.getUniversite();
        return new ResponseEntity<>(universites, HttpStatus.OK);
    }

    // Update an existing Universite
    @PutMapping("/update")
    public ResponseEntity<Universite> updateUniversite(@RequestBody Universite universite) {
        Universite updatedUniversite = universiteService.updateUniversite(universite);
        return new ResponseEntity<>(updatedUniversite, HttpStatus.OK);
    }

    // Delete a Universite by id
    @DeleteMapping("/delete/{idUniversite}")
    public ResponseEntity<Void> deleteUniversite(@PathVariable Long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
