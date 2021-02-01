package com.example.hero.dto;

public class HeroHealthDto {

    public String name;
    public int health;

    public HeroHealthDto(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "HeroHealthDto{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
