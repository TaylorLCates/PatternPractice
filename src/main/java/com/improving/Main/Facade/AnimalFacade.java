package com.improving.Main.Facade;

public class AnimalFacade {
    private Animal dog;
    private Animal cat;
    private Animal lizard;

    public AnimalFacade() {
        dog = new Dog();
        cat = new Cat();
        lizard = new Lizard();
    }

    public void makeDogEat(){
        dog.eat();
    }

    public void makeCatEat() {
        cat.eat();
    }

    public void makeLizardEat() {
        lizard.eat();
    }
}
