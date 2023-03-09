package Less_02.cage;

import java.util.ArrayList;
import java.util.Collections;

import Less_02.animals.Animal;
import Less_02.other.AnimalComporator;

public interface AnimalCage<T extends Animal> {

    int addAnimal(T animal);

    String deliverFood(int weightFood);

    String cleanCage();

    Animal randomAnimal();

    default void sortByAge (ArrayList<T> animals) {
        Collections.sort(animals, new AnimalComporator());
    }
}
