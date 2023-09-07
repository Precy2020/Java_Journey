package Polymorphism;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AnimalTest {
    @Test
    public void TestThatAnimalsDoDifferentThings(){
        Animal [] animals = new Animal[4];
        for (Animal animal: animals) {
                    animal = new Dog();
                    animal = new Cow();
                    animal = new Goat();
                    animal = new Cat();
        }
    }
}
