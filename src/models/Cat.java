package models;
import main.java.interfaces.IAnimal;

public class Cat implements IAnimal {
    @Override
    public void MakeSound() {
        System.out.println("Miauuuu!");
    }
}
