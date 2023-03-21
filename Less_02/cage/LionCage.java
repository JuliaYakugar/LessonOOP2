package Less_02.cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Less_02.animals.Lion;
import Less_02.other.LionComporator;

public class LionCage implements AnimalCage<Lion> {

    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public LionCage(){
        this.lions = new ArrayList<Lion>();
    }

    @Override
    public int addAnimal(Lion animal) {
        lions.add((Lion) animal);
        return lions.size();
    }

    @Override
    public String deliverFood(int weightFood) {
        for (Lion lion : lions) {
            lion.feed(weightFood / lions.size());
        }
        return "Мы скормили - " + weightFood + "кг " + lions.size() + " львам";
    }

    @Override
    public String cleanCage() {
        return "Клетка очищена";
    }

    @Override
    public String toString() {
        return "Клетка со львами -> Львы: \n" + lions;
    }

    @Override
    public Lion randomAnimal() {
        if (lions.size() > 0) {
            return lions.get(new Random().nextInt(lions.size()));
        } else {
            return null;
        }
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    public void sortLionsManeVolume() {
        Collections.sort(lions, new LionComporator());
    }

    @Override
    public void deleteAnimal() {
        this.lions.remove(randomAnimal());
    }

    @Override
    public void createAnimal(String[] parameters) {
        lions.add(new Lion(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3])));
    }
    

}
