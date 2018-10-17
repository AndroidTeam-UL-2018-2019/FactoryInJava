package models;

import interfaces.IAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {

    @Test
    void createAnimalObjectCow() {
        IAnimal animal = AnimalFactory.CreateAnimalObject(models.Animals.Cow);
        assertTrue(animal instanceof IAnimal);
    }

    @Test
    void createAnimalObjectDog() {
        IAnimal animal = AnimalFactory.CreateAnimalObject(models.Animals.Dog);
        assertTrue(animal instanceof IAnimal);
    }

    @Test
    void createAnimalObjectCat() {
        IAnimal animal = AnimalFactory.CreateAnimalObject(models.Animals.Cat);
        assertTrue(animal instanceof IAnimal);
    }
}