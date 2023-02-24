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
        if (animal instanceof Wolf) {
            this.wolfs.add((Wolf) animal);
        }
        return wolfs.size(); 
    }

    public ArrayList<Wolf> getWolfs() {
        return this.wolfs;
    }

    @Override
    public String deliverFood(int weightFood) {
        for (Wolf wolf : wolfs) {
            wolf.feed(weightFood / wolfs.size());
        }
        return "Мы скормили - " + weightFood + "кг " + wolfs.size() + " волкам";
    }

    @Override
    public String cleanCage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Animal randomAnimal() {
        if (wolfs.size() > 0) {
            return wolfs.get(new Random().nextInt(wolfs.size()));
        } else {
            return null;
        }
        
    }
    
}
