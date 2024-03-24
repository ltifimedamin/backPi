package com.example.carecareforeldres.Service;

import com.example.carecareforeldres.DTO.PlatWithIngredientsDTO;
import com.example.carecareforeldres.Entity.Ingredient;
import com.example.carecareforeldres.Entity.Patient;
import com.example.carecareforeldres.Entity.Plat;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Set;

public interface IServicePlat {




    Plat addPlatDTO(PlatWithIngredientsDTO platDTO);

    Plat addPlatPatient(Plat pt, Integer p);

    List<Plat> getAll();

    void remove(int idf);

    Plat update(Plat res);








    Boolean testMaladie(Plat pt, Integer idPatient);

}
