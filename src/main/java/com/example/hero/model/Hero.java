package com.example.hero.model;

import java.util.List;
import java.util.Objects;

public class Hero {
    private String name;
    private int strength;
    private int health;
    private int stamina;

    public Hero(String name, int strength, int health, int stamina) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return strength == hero.strength && health == hero.health && stamina == hero.stamina && name.equals(hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

//    @Override
//    public int compareTo(Hero o) {            // Question --> Sort based on strength
//
////        return this.name.compareTo(o.name);
////
////        Hero h = (Hero) o;
////        return this.strength - h.strength;
//
//        return Integer.compare(getStrength(),o.getStrength());
//
//        //return o.getName().compareTo("A");
//    }

}
