package models;
import interfaces.IAnimal;

public class AnimalFactory {

    public static IAnimal CreateAnimalObject(Animals animalType){
        IAnimal animal;
        switch (animalType)
        {
            case Cat:
                animal = new Cat();
                break;
            case Cow:
                animal = new Cow();
                break;
            case Dog:
                animal = new Dog();
                break;
            default:
                throw new IllegalArgumentException("Undefinded animal type.");
        }
        return animal;
    }

}
