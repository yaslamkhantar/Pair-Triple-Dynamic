package elmoukhantar.yass.agencevoyage.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ceo {
    @Id
    private String iden;
    private String nom;
    private String prenom;
    private String adresse;

}
