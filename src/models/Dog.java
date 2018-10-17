package models;

import main.java.interfaces.IAnimal;

public class Dog implements IAnimal {
    @Override
    public void MakeSound() {
        System.out.println("Hauuu!!!");
    }
}
