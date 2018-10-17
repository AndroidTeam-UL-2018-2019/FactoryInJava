package models;
import interfaces.IAnimal;

public class AnimalFactory {

    public static IAnimal CreateAnimalObject(models.Animals animalType){
        IAnimal animal;
        switch (animalType)
        {
            case Cat:
                animal = new models.Cat();
                break;
            case Cow:
                animal = new models.Cow();
                break;
            case Dog:
                animal = new models.Dog();
                break;
            default:
                throw new IllegalArgumentException("Undefinded animal type.");
        }
        return animal;
    }

}
