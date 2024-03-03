package com.example.carecareforeldres.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFood;

    private String nomFood;
    private float calorie;
    private int quantite;

    private LocalDateTime dateAjout;//date l'ajout plat délai

    @ManyToOne(cascade = CascadeType.ALL)
    Plat plat;

    @ManyToMany
    private List<Maladie> maladies;
}
