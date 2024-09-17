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
public class Transport {

    @Id
    private int id;
    private String type;
    private String traget;
    private String conducteur;
}
