package Less_02.animals;

public abstract class Animal {
    protected int yearBirth;
    protected int weightAnimal;
    protected int numberLimbs;

    public Animal(int yearBirth, int weightAnimal, int numberLimbs) {
        this.yearBirth = yearBirth;
        this.weightAnimal = weightAnimal;
        this.numberLimbs = numberLimbs;
    }

    public void feed(int foodWeight) {
        if ((this.weightAnimal + foodWeight) <= getMaxWeight()) {
            this.weightAnimal = this.weightAnimal + foodWeight;
        } else {
            System.out.println("Нельзя покормить, превышен максимальный вес "  + getMaxWeight());
        }
    }

    public abstract int getMaxWeight();

    public abstract String getType();
    
}
