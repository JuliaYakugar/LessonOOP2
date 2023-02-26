package Less_02;

import java.util.ArrayList;

import Less_02.animals.Lion;
import Less_02.animals.Wolf;
import Less_02.cage.LionCage;
import Less_02.cage.WolfCage;
import Less_02.factory.LionsFactory;

public class Main {
    
    public static void main(String[] args) {

        Lion lionAva = new Lion(2010, 14, 4, 500);
        System.out.println("Лев Ава до кормления: " + lionAva);
        lionAva.feed(2);
        System.out.println("Лев Ава после кормления (+ 2кг): " + lionAva);

        lionAva.feed(2); 

        ArrayList<Lion> lions = LionsFactory.createLions(1);

        LionCage lc = new LionCage(lions);
        
        System.out.println(lc);
        System.out.println("===========");

        System.out.println(lc.deliverFood(100));
        System.out.println("===========");

        System.out.println(lc);
        System.out.println("===========");

        WolfCage goodWolfs = new WolfCage();
        goodWolfs.addAnimal(new Wolf(6, 13, 4, "Белый"));
        goodWolfs.addAnimal(new Wolf(3, 9, 4, "Черный"));
        goodWolfs.addAnimal(new Wolf(3, 7, 4, "Серый"));

        if (goodWolfs.getWolfs().size() > 0) {
            System.out.println(goodWolfs.randomAnimal());
        } else {
            System.out.println("Клетка пустая");
        } 

        System.out.println(goodWolfs.deliverFood(30));
        for (Wolf wolf : goodWolfs.getWolfs()) {
            System.out.println(wolf);
        }

        System.out.println("=====lesson 3=====");

        lc.addAnimal(lionAva);
        System.out.println(lc);
        lc.sortLions();
        System.out.println(lc);
        lc.sortLionsManeVolume();
        System.out.println(lc);

    }
}
