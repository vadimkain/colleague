package com.kain;

public class Program {
    public static void main(String[] args) {
        Wild lion = new Carnivorous("Lion", true, true);
        lion.information();
        Wild tiger = new Carnivorous("Tiger", false, true);
        tiger.information();
        Wild deer = new Herbivorous("Deer", true, false);
        deer.information();
        Wild gazelle = new Herbivorous("Gazelle", true, true);
        gazelle.information();
        Domesticated cow = new Livestock("Cow", true, true);
        cow.information();
        Domesticated pig = new Livestock("Pig", true, false);
        pig.information();
        Domesticated cat = new Pet("Cat", true, true, true);
        cat.information();
        Domesticated dog = new Pet("Dog", true, true, true);
        dog.information();
    }
}
