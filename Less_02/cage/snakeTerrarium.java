package Less_02.cage;

import java.util.ArrayList;
import java.util.Random;

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
        if (snakes.size() > 0) {
            return snakes.get(new Random().nextInt(snakes.size()));
        } else {
            return null;
        }
    }

    @Override
    public void deleteAnimal() {
        snakes.remove(randomAnimal());
    }
    

    @Override
    public void createAnimal(String[] parameters) {
        snakes.add(new Snake(Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5])));
    }

    
    @Override
    public String toString() {
        return "Террариум со змеями -> Змеи: \n" + snakes;
    }
    
}
