package Less_02.zoo;

import Less_02.animals.Lion;
import Less_02.animals.Snake;
import Less_02.animals.Wolf;
import Less_02.cage.AnimalCage;
import Less_02.cage.LionCage;
import Less_02.cage.SnakeTerrarium;
import Less_02.cage.WolfCage;

public class Zoo {

    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeTerrarium;
    
    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeTerrarium = snakeTerrarium;
    }

    public Zoo() {
        this.wolfCage = new WolfCage();
        this.lionCage = new LionCage();
        this.snakeTerrarium = new SnakeTerrarium();
    }

    public AnimalCage<Lion> getLionCage() {
        return this.lionCage;
    }

    public AnimalCage<Wolf> getWolfCage() {
        return this.wolfCage;
    }

    public AnimalCage<Snake> getSnakeTerrarium() {
        return this.snakeTerrarium;
    }

    public void deleteLion() {
        this.lionCage.deleteAnimal();
    }

    public void deleteWolf() {
        this.wolfCage.deleteAnimal();
    }

    public void deleteSnake() {
        this.snakeTerrarium.deleteAnimal();
    }

    public void createLion(String[] parameters) {
        this.lionCage.createAnimal(parameters);
    }

    public void createWolf(String[] parameters) {
        this.wolfCage.createAnimal(parameters);
    }

    public void createSnake(String[] parameters) {
        this.snakeTerrarium.createAnimal(parameters);
    }


    
}
