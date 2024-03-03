package com.example.carecareforeldres.RestController;

import com.example.carecareforeldres.Entity.Plat;
import com.example.carecareforeldres.Entity.Restaurant;
import com.example.carecareforeldres.Repository.PlatRepository;
import com.example.carecareforeldres.Service.PlatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/plat")
@CrossOrigin("*")
public class PlatController {
    PlatService platService;
    PlatRepository platRepository;


    @PostMapping("/add")
    public Plat ajouterPlat(@RequestBody Plat res){
        Plat p1=platService.addPlat(res);
        return p1;
    }

    @GetMapping("/retrive_all_plat")
    public List<Plat> retrievePlatList(){

        return platService.getAll();
    }

    @GetMapping("/retrive_plat/{platId}")
    public Plat retrievePlat(@PathVariable("platId") Integer platId){

        return platRepository.findById(platId).get();
    }

    @PutMapping("/update_plat")
    public Plat updatePlat(@RequestBody Plat plat){

        return platService.update(plat);
    }

    @DeleteMapping("/delete_plat/{platId}")
    public void deletePlat(@PathVariable("platId") Integer platId){
        platService.remove(platId);
    }


}
