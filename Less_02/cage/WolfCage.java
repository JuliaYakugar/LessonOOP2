package Less_02.cage;

import java.util.ArrayList;
import java.util.Random;

import Less_02.animals.Animal;
import Less_02.animals.Wolf;

public class WolfCage implements AnimalCage{

    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    public WolfCage() {
        this.wolfs = new ArrayList<Wolf>();
    }

    @Override
    public int addAnimal(Animal animal) {
        this.wolfs.add((Wolf) animal);
        return wolfs.size();
    }

    @Override
    public String deliverFood(int weightFood) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cleanCage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Animal randomAnimal() {
        return wolfs.get(new Random().nextInt(wolfs.size()));
    }
    
}
