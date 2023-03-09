package Less_02.zoo;

import Less_02.animals.Lion;
import Less_02.animals.Snake;
import Less_02.animals.Wolf;
import Less_02.cage.AnimalCage;

public class Zoo {

    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeTerrarium;
    
    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeTerrarium = snakeTerrarium;
    }

    
    
}
