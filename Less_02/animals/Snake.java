package Less_02.animals;

public class Snake extends Animal{

    private int lengthAnimal;
    private static final int MAX_WEIGHT = 6;
    private static final String TYPE = "Змея";

    public Snake(int yearBirth, int weightAnimal, int numberLimbs, int lengthAnimal) {
        super(yearBirth, weightAnimal, numberLimbs);
        this.lengthAnimal = lengthAnimal;
    }

    public String toString(){
        return TYPE + " -> Год рождения: " + yearBirth + ", Вес: " + weightAnimal + ", Количество конечностей: " + numberLimbs + ", Длина: " + lengthAnimal;
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
