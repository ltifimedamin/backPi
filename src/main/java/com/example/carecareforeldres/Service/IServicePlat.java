package com.example.carecareforeldres.Service;

import com.example.carecareforeldres.Entity.Plat;
import com.example.carecareforeldres.Entity.Restaurant;

import java.util.List;

public interface IServicePlat {

    Plat addPlat(Plat res);

    List<Plat> getAll();

    void remove(int idf);

    Plat update(Plat res);
}
