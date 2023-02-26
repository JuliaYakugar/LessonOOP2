package Less_02.cage;

import java.util.ArrayList;
import java.util.Collections;

import Less_02.animals.Animal;
import Less_02.animals.Lion;
import Less_02.other.LionComporator;

public class LionCage implements AnimalCage {

    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public int addAnimal(Animal animal) {
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
        return "Клетка со львами -> Львы: " + lions;
    }

    @Override
    public Animal randomAnimal() {
        // TODO Auto-generated method stub
        return null;
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    public void sortLionsManeVolume() {
        Collections.sort(lions, new LionComporator());
    }
    

}
