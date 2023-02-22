package Less_02.animals;

public class Lion extends Animal {

    private int maneVolume;
    private static final int MAX_WEIGHT = 35;
    private static final String TYPE = "Лев";

    public Lion(int yearBirth, int weightAnimal, int numberLimbs, int maneVolume) {
        super(yearBirth, weightAnimal, numberLimbs);
        this.maneVolume = maneVolume;
    }

    public String toString(){
        return TYPE + " -> Год рождения: " + yearBirth + ", Вес: " + weightAnimal + ", Количество конечностей: " + numberLimbs + ", Объем гривы: " + maneVolume;
    }

    @Override
    public int getMaxWeight() {
        
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }
    
}
