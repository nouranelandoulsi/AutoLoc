package tn.esprit.nourane_landoulsi_4iet_i3.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEmploye;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING)
    RoleEmploye role;

    @ManyToOne
    Agence agence;


}
