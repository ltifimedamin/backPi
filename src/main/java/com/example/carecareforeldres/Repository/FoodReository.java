package com.example.carecareforeldres.Repository;

import com.example.carecareforeldres.Entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodReository extends JpaRepository<Ingredient,Integer> {
}
