package com.example.carecareforeldres.Repository;

import com.example.carecareforeldres.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface PlatRepository extends JpaRepository<Plat,Integer> {
    @Query("SELECT COALESCE(SUM(i.calorie), 0) FROM Ingredient i JOIN i.plats p JOIN p.repas r WHERE r.patient.idpatient = :userId AND p.datePlat = CURRENT_DATE")
    float calculateCaloriesConsumedByUserToday(@Param("userId") Integer userId);




}
