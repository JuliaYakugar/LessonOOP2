package Less_02.cage;

import Less_02.animals.Animal;

public interface AnimalCage {

    int addAnimal(Animal animal);

    String deliverFood(int weightFood);

    String cleanCage();

    Animal randomAnimal();
}
