package models;
import interfaces.IAnimal;

public class Cat implements IAnimal {
    @Override
    public void MakeSound() {
        System.out.println("Miauuuu!");
    }
}
