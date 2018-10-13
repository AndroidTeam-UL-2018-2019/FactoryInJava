package com.company;

import interfaces.IAnimal;
import models.AnimalFactory;
import models.Animals;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IAnimal animal = AnimalFactory.CreateAnimalObject(Animals.Cow);
        animal.MakeSound();
    }
}
