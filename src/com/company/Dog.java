package com.company;

public class Dog extends Pet{
    private int smellStrength;

    public Dog(int health, String name, int smellStrength) {
        super(health, name);
        this.smellStrength = smellStrength;
        this.setAbility(superAbility.SUPER_SMELL);
    }

    @Override
    public void print() {
        System.out.println("Dog's Name: " + this.getName() +
                "\nHealth: " + this.getHealth() +
                "\nSuper Ability: " + this.getSuperAbility() +
                "\nSmell strength: " + this.smellStrength);
    }
}
