package com.example.carecareforeldres.Service;

import com.example.carecareforeldres.Entity.Plat;
import com.example.carecareforeldres.Entity.Restaurant;
import com.example.carecareforeldres.Repository.PlatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class PlatService implements IServicePlat{

    PlatRepository platRepository;

    @Override
    public Plat addPlat(Plat pt) {

        pt.setDatePlat(LocalDateTime.now());
        return platRepository.save(pt);}
    @Override
    public List<Plat> getAll(){return platRepository.findAll();}

    @Override
    public void remove(int idf) {
        platRepository.deleteById(idf);}

    @Override
    public Plat update(Plat res) {
        return platRepository.save(res);
    }
}
