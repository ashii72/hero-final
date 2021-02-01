package com.example.hero;

import com.example.hero.model.Hero;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HeroApplicationTests {

    @Test
    void contextLoads() {

        Hero h1 = new Hero("Athena", 20, 70, 76);
        Hero h2 = new Hero("Gaia", 32, 70, 95);
        Hero h3 = new Hero("Atreus", 45, 85, 95);
        Hero h4 = new Hero("Ashkan",90,100,98);
        Hero h5 = new Hero("A",90,100,98);

        List<Hero> heroList = new ArrayList<>(List.of(h1, h2, h3, h4));

//        for (Hero hero: heroList) {
//            if (hero.getName().equals(h4.getName()))
//            System.out.println(hero.toString());
//        }

        System.out.println(heroList.contains(h4));

    }

}
