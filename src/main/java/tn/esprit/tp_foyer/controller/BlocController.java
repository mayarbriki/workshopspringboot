package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entities.Bloc;
import tn.esprit.tp_foyer.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {

    private final IBlocService iBlocService;

    // Create a new Bloc
    @PostMapping("/add")
    public ResponseEntity<Bloc> addBloc(@RequestBody Bloc bloc) {
        Bloc createdBloc = iBlocService.addBloc(bloc);
        return new ResponseEntity<>(createdBloc, HttpStatus.CREATED);
    }

    // Retrieve all Blocs
    @GetMapping("/all")
    public ResponseEntity<List<Bloc>> getAllBlocs() {
        List<Bloc> blocs = iBlocService.getBloc();
        return new ResponseEntity<>(blocs, HttpStatus.OK);
    }

    // Update an existing Bloc
    @PutMapping("/update")
    public ResponseEntity<Bloc> updateBloc(@RequestBody Bloc bloc) {
        Bloc updatedBloc = iBlocService.updateBloc(bloc);
        return new ResponseEntity<>(updatedBloc, HttpStatus.OK);
    }

    // Delete a Bloc by id
    @DeleteMapping("/delete/{idBloc}")
    public ResponseEntity<Void> deleteBloc(@PathVariable Long idBloc) {
        iBlocService.deleteBloc(idBloc);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
