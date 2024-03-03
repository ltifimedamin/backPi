package com.example.carecareforeldres.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrd;
    private String DescOrd;
    private EtatOrdennance etatOrdennance;
    private Date dateEmmission;//dateFin
    private Date validate;//date jusqua ord validé



}
