package com.example.carecareforeldres.Service;

import com.example.carecareforeldres.Entity.Ingredient;

import java.util.List;

public interface IServiceFood {

    Ingredient addFood(Ingredient food);

    List<Ingredient> getAll();

    void remove(int idf);

    Ingredient update(Ingredient food);

}
