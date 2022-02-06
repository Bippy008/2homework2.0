package com.company;

public class Parrot extends Pet{
    private int wordsCount;

    public Parrot(int health, String name, int wordsCount) {
        super(health, name);
        this.wordsCount = wordsCount;
        this.setAbility(superAbility.TALKING);
    }

    @Override
    public void print() {
        System.out.println("Parrot's Name: " + this.getName() +
                "\nHealth: " + this.getHealth() +
                "\nSuper Ability: " + this.getSuperAbility() +
                "\nParrot knows: " + this.wordsCount + " words");
    }
}
