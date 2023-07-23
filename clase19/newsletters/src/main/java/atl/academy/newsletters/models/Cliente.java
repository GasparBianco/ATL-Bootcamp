package atl.academy.newsletters.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

}
