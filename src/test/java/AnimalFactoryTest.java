package test.java;

import main.java.interfaces.IAnimal;
import models.AnimalFactory;
import models.Animals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {

    @Test
    void createAnimalObjectCow() {
        IAnimal animal = AnimalFactory.CreateAnimalObject(Animals.Cow);
        assertNotNull(animal);
    }

    @Test
    void createAnimalObjectDog() {
        IAnimal animal = AnimalFactory.CreateAnimalObject(models.Animals.Dog);
        assertNotNull(animal);
    }

    @Test
    void createAnimalObjectCat() {
        IAnimal animal = AnimalFactory.CreateAnimalObject(models.Animals.Cat);
        assertNotNull(animal);
    }
}