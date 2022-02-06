package com.company;

public class Main {

    public static void main(String[] args) {
        Pet mainDog = createObject("Dog");
        Pet mainParrot = createObject("Parrot");
        Pet mainHorse = createObject("Horse");
        Pet mainObject = createObject("Blabla");
        mainDog.print();
        System.out.println("______________________");
        mainParrot.print();
        System.out.println("______________________");
        mainHorse.print();
        System.out.println("______________________");
        mainObject.print();
        System.out.println("______________________");
    }

    public static Pet createObject(String className) {
        switch (className) {
            case "Dog":
                Pet dog = new Dog(20, "Bobik", 25);
                return dog;
            case "Parrot":
                Pet parrot = new Parrot(10, "Richard", 5);
                return parrot;
            case "Horse":
                Pet horse = new Horse(30, "Grogar", 56);
                return horse;
            default:
                Pet none = new Pet(0, "") {
                    @Override
                    public void print() {
                        System.out.println("Объект не создан.");
                    }
                };
                return none;
        }
    }
}
