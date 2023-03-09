package Less_02.animalUtils;

import java.util.ArrayList;
import java.util.Collections;

import Less_02.animals.Animal;
import Less_02.other.AnimalComporator;

public class AnimalUtils<T> {

    public static <T extends Animal> ArrayList<T> sortAnimals(ArrayList<T> animals) {
        Collections.sort(animals, new AnimalComporator());
        return animals;
    }
    
}
