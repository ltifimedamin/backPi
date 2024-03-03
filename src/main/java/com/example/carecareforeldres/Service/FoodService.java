package com.example.carecareforeldres.Service;

import com.example.carecareforeldres.Entity.Ingredient;
import com.example.carecareforeldres.Repository.FoodReository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodService implements IServiceFood{

    FoodReository foodReository;

    /////////////////////////CRUD//////////////////////////////////////

    @Override
    public Ingredient addFood(Ingredient food) {return foodReository.save(food);}
    @Override
    public List<Ingredient> getAll(){return foodReository.findAll();}

    @Override
    public void remove(int idf) {
        foodReository.deleteById(idf);}

    @Override
    public Ingredient update(Ingredient food) {
        return foodReository.save(food);
    }



    /////////////////////////////////////////////////////////////////////


}
