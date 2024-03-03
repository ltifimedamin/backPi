package com.example.carecareforeldres.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlat;

    private String nomPlat;
    private String descPlat;
    private float prixPlat;
    private LocalDateTime datePlat;//date l'ajout plat délai

    @Enumerated(EnumType.STRING)
    private List<TypePlat> typePlat;

    @ManyToOne
    Restaurant restaurant;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plat")
    @JsonIgnore
    private Set<Ingredient> foods;
}
