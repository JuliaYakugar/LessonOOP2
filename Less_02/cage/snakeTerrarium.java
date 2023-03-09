package Less_02.cage;

import java.util.ArrayList;

import Less_02.animals.Animal;
import Less_02.animals.Snake;

public class snakeTerrarium implements AnimalCage<Snake> {

    private ArrayList<Snake> snakes;

    public snakeTerrarium(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public snakeTerrarium() {
        this.snakes = new ArrayList<Snake>();
    }

    public ArrayList<Snake> getSnakes() {
        return this.snakes;
    }

    @Override
    public int addAnimal(Snake animal) {
        // TODO Auto-generated method stub
        return 0;
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
        // TODO Auto-generated method stub
        return null;
    }
    
}
