package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.* ;
import org.hibernate.annotations.Cascade;

import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyer ;


}
