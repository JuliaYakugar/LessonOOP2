package Less_02.animals;

public class Wolf extends Animal {

    private String coatColor;
    private static final int MAX_WEIGHT = 40;
    private static final String TYPE = "Волк";

    public Wolf(int yearBirth, int weightAnimal, int numberLimbs, String coatColor) {
        super(yearBirth, weightAnimal, numberLimbs);
        this.coatColor = coatColor;
    }

    public String toString(){
        return TYPE + " -> Год рождения: " + yearBirth + ", Вес: " + weightAnimal + ", Количество конечностей: " + numberLimbs + ", Окрас шерсти: " + coatColor + "\n";
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
