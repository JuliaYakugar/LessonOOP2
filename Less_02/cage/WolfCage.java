package Less_02.cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import Less_02.animals.Animal;
import Less_02.animals.Wolf;
import Less_02.other.WolfComparator;
import Less_02.other.WolfIterator;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf>{

    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    public WolfCage() {
        this.wolfs = new ArrayList<Wolf>();
    }

    @Override
    public int addAnimal(Wolf animal) {
        this.wolfs.add(animal);
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
    public Wolf randomAnimal() {
        if (wolfs.size() > 0) {
            return wolfs.get(new Random().nextInt(wolfs.size()));
        } else {
            return null;
        }
        
    }

    @Override
    public String toString() {
        return "Клетка с волками -> Волки: \n" + wolfs;
    }
    
    public void sortWolfWeightAndAge() {
        Collections.sort(wolfs, new WolfComparator());
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }

    @Override
    public void deleteAnimal() {
        wolfs.remove(randomAnimal());
    }

    @Override
    public void createAnimal(String[] parameters) {
        wolfs.add(new Wolf(Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), parameters[5]));
    }

}
