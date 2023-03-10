package Less_02.cage;

import java.util.ArrayList;

import Less_02.animals.Animal;
import Less_02.animals.Snake;

public class SnakeTerrarium implements AnimalCage<Snake> {

    private ArrayList<Snake> snakes;

    public SnakeTerrarium(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public SnakeTerrarium() {
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
    public Snake randomAnimal() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
