package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.* ;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idChambre ;
    private Long numeroChambre ;
@Enumerated(EnumType.STRING)
    private TypeChambre typeC ;

}