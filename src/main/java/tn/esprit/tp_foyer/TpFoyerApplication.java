package tn.esprit.tp_foyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TpFoyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpFoyerApplication.class, args);
    }

}
