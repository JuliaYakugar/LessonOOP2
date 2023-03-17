package Less_02.animals;

public class Lion extends Animal implements Comparable<Lion> {

    private int maneVolume;
    private static final int MAX_WEIGHT = 35;
    private static final String TYPE = "Лев";

    public Lion(int yearBirth, int weightAnimal, int numberLimbs, int maneVolume) {
        super(yearBirth, weightAnimal, numberLimbs);
        this.maneVolume = maneVolume;
    }

    public String toString(){
        return TYPE + " -> Год рождения: " + yearBirth + ", Вес: " + weightAnimal + ", Количество конечностей: " + numberLimbs + ", Объем гривы: " + maneVolume + "\n";
    }

    public int getManeVolume() {
        return maneVolume;
    }
    
    @Override
    public int getMaxWeight() {
        
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int compareTo(Lion o) {
        if (this.yearBirth > o.yearBirth)
            return 1;
        else if (this.yearBirth < o.yearBirth)
            return -1;
        else
            return 0;
        }
    
}
