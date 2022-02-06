package com.company;

// это как бы класс питомца в онлайн игре

public abstract class Pet implements Printable{
    private int health;
    private String name;
    private superAbility ability;

    public Pet(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public superAbility getSuperAbility() {
        return ability;
    }

    protected void setAbility(final superAbility ability) {
        this.ability = ability;
    }
}
