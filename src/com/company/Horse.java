package com.company;

public class Horse extends Pet{
    private int speed;

    public Horse(int health, String name, int speed) {
        super(health, name);
        this.speed = speed;
        this.setAbility(superAbility.FAST_RUNNING);
    }

    @Override
    public void print() {
        System.out.println("Horse's Name: " + this.getName() +
                "\nHealth: " + this.getHealth() +
                "\nSuper Ability: " + this.getSuperAbility() +
                "\nSpeed: " + this.speed);
    }
}
