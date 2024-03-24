package com.example.carecareforeldres.Entity;

import com.example.carecareforeldres.DTO.IngredientAvecMaladieDTO;
import com.example.carecareforeldres.DTO.PlatWithIngredientsDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIngredient;

    private String nomIngredient;
    private float calorie;
    private int quantite;
    private boolean consommable;
    private LocalDateTime dateAjout;//date l'ajout plat délai


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "ingredients")
    @JsonIgnore
    private List<Plat> plats = new ArrayList<>();


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Maladie> maladies=new ArrayList<>();


}
