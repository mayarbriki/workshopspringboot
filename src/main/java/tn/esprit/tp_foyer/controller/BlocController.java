package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tp_foyer.services.IBlocService;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    IBlocService iBlocService;

}
