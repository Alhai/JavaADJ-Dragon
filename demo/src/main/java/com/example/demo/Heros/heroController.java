package com.example.demo.Heros;


import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class heroController {


    public static List<dataHeroClass> getAllHeros = new ArrayList<>();

    static {
        getAllHeros.add(new dataHeroClass(1,"Kyle","Mage",5)) ;
        getAllHeros.add(new dataHeroClass(2,"Cartman","Guerrier",5)) ;
        getAllHeros.add(new dataHeroClass(3,"Kenny","Guerrier",5)) ;
        getAllHeros.add(new dataHeroClass(4,"Stan","Mage",5)) ;
    }


    @GetMapping
    public List<dataHeroClass> getList(){
        return getAllHeros;
    }

}
