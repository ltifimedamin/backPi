package com.example.carecareforeldres.RestController;

import com.example.carecareforeldres.Entity.Ingredient;
import com.example.carecareforeldres.Repository.FoodReository;
import com.example.carecareforeldres.Service.IServiceFood;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/food")
@CrossOrigin("*")

public class IngredientController {

    IServiceFood ServiceFood;
    FoodReository foodReository;

    @PostMapping("/add")
    public Ingredient ajouterFood(@RequestBody Ingredient food1){
        Ingredient p1=ServiceFood.addFood(food1);
        return p1;
    }

    @GetMapping("/retrive_all_food")
    public List<Ingredient> retrieveFoodList(){

        return ServiceFood.getAll();
    }

    @GetMapping("/retrive_food/{foodId}")
    public Ingredient retrieveFood(@PathVariable("foodId") Integer idf){

        return foodReository.findById(idf).get();
    }

    @PutMapping("/update_food")
    public Ingredient updateFood(@RequestBody Ingredient food){

        return ServiceFood.update(food);
    }

    @DeleteMapping("/delete_food/{foodId}")
    public void deleteFood(@PathVariable("foodId") Integer foodId){
        ServiceFood.remove(foodId);
    }




    ///////////////////////////////////////////////////////////////////////////////////////















}