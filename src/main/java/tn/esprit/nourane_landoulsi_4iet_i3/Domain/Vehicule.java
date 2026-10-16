package tn.esprit.nourane_landoulsi_4iet_i3.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;
    String immatriculation;
    String marque;
    String modele;
    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;
    BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    StatutVehicule statut;

    @ManyToOne
    Agence agence;

    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    @ToString.Exclude
    List<Maintenance> maintenances;

    @ManyToMany
    @JoinTable(name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "id_vehicule"),
            inverseJoinColumns = @JoinColumn(name = "id_equipement"))
    @ToString.Exclude
    List<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    @ToString.Exclude
    List<Reservation> reservations;
}