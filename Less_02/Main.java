package Less_02;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import Less_02.animals.Lion;
import Less_02.animals.Wolf;
import Less_02.cage.LionCage;
import Less_02.cage.WolfCage;
import Less_02.factory.LionsFactory;
import Less_02.animalUtils.AnimalUtils;

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
        goodWolfs.addAnimal(new Wolf(2, 9, 4, "Серый"));

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

        System.out.println("=====Lesson 3=====");
        System.out.println(goodWolfs);
        goodWolfs.sortWolfWeightAndAge();
        System.out.println(goodWolfs);

        System.out.println("======Итератор=====");
        for (Wolf wolf : goodWolfs) {
            System.out.println(wolf);
        }

        System.out.println("======Сортировка=====");

        ArrayList<Wolf> badWolfs = new ArrayList<Wolf>();
        badWolfs.add(new Wolf(6, 13, 4, "Белый"));
        badWolfs.add(new Wolf(3, 9, 4, "Черный"));
        badWolfs.add(new Wolf(4, 9, 4, "Серый"));

        for (Wolf wolf : badWolfs) {
            System.out.println(wolf);
        }

        AnimalUtils.sortAnimals(badWolfs);
        System.out.println("===========");

        for (Wolf wolf : badWolfs) {
            System.out.println(wolf);
        }

        
        
        
    }
}
