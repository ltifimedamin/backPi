package com.example.carecareforeldres.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Repas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private LocalDate dateRepas;

    @Enumerated(EnumType.STRING)
    private TypeRepas typeRepas;



    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "repas")
    @JsonIgnore
    private List<Plat> plats;



    @ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;
}
