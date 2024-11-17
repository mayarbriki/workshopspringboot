package tn.esprit.tp_foyer.entities;
import jakarta.persistence.* ;
import lombok.* ;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chambre {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idChambre ;
    private Long numeroChambre ;
@Enumerated(EnumType.STRING)
    private TypeChambre typeC ;
@ManyToOne
    Bloc bloc ;
@ToString.Exclude
@OneToMany
    List<Reservation> reservations ;


}