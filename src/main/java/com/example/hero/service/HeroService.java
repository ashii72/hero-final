package com.example.hero.service;

import com.example.hero.dto.HeroHealthDto;
import com.example.hero.model.Hero;

import java.util.List;

public interface HeroService {
    Hero getHeroByName(String name);
    List<Hero> getHeroByStrength(int strength);
    List<Hero> getHeroByStamina(int stamina);
    List<HeroHealthDto> getHeroHealth();
    String getGodName();
    List<Hero> getSortedListByStrengthAsc();  //Ascending
    List<Hero> getSortedListByStrengthDesc();  // Descending
    List<Hero> multipleSorting();
    Hero findHeroByHeroObject(Hero hero);
    List<Hero> removeHeroByHeroObject(Hero hero);
}

// List --> contain,sort,sublist,remove,... //Use these API's

