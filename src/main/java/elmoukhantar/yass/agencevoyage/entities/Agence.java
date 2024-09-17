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

public class Agence {
    @Id
    private String iden;
    private String name;
    private String ville;

}
