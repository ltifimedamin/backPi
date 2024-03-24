package com.example.carecareforeldres.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Counge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private LocalDateTime dateAjout;
    @Enumerated(EnumType.STRING)
    private EtatCounger etatCounger;
    @Enumerated(EnumType.STRING)
    private TypeCounger typeCounger;


    @ManyToOne
    private Cuisinier cuisinierC;

}
