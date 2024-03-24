package com.example.carecareforeldres.Repository;

import com.example.carecareforeldres.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientREpository extends JpaRepository<Patient,Integer> {
    @Query("SELECT YEAR(CURRENT_DATE()) - YEAR(p.dateDeNaissance) FROM Patient p WHERE p.idpatient = :patientId")
    Integer calculatePatientAgeById(@Param("patientId") Integer patientId);
}
