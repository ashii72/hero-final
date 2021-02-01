package com.example.hero.controller;

import com.example.hero.dto.HeroHealthDto;
import com.example.hero.model.Hero;
import com.example.hero.service.GodServiceImpl;
import com.example.hero.service.HeroService;
import com.example.hero.service.HeroServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/godofwar")
public class HeroController {

    HeroService heroService = new HeroServiceImpl(new GodServiceImpl()); // why we impl "new GodServiceImpl()" in HeroServiceImpl as an input?

    @GetMapping("/hero")
    public Hero getHeroByName(@RequestParam("name") String name) {
        return heroService.getHeroByName(name);
    }

    @GetMapping("/hero/strength")
    public List<Hero> getHeroByStrength(@RequestParam("strength") int strength) {
        return heroService.getHeroByStrength(strength);
    }

    @GetMapping("/hero/stamina/{stamina}")
    public List<Hero> getHeroByStamina(@PathVariable int stamina) {
        return heroService.getHeroByStamina(stamina);
    }

    @GetMapping("/hero/health")
    public List<HeroHealthDto> getHeroHealth() {
        return heroService.getHeroHealth();
    }

    @PostMapping("/hero/find")
    public Hero getHeroByHeroObject(@RequestBody Hero hero) {
        return heroService.findHeroByHeroObject(hero);
    }

    @PostMapping("/hero/remove")
    public List<Hero> removeHeroByHeroObject(@RequestBody Hero hero) {
        return heroService.removeHeroByHeroObject(hero);
    }

    @GetMapping("/hero/asc")
    public List<Hero> getSortedListByStrengthAsc() {
        return heroService.getSortedListByStrengthAsc();
    }

    @GetMapping("/hero/desc")
    public List<Hero> getSortedListByStrengthDesc() {
        return heroService.getSortedListByStrengthDesc();
    }

    @GetMapping("/hero/sort")
    public List<Hero> multipleSorting() {
        return heroService.multipleSorting();
    }
}
