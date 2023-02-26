package Less_02.factory;

import java.util.ArrayList;

import Less_02.animals.Lion;

public class LionsFactory {
    
    public static ArrayList<Lion> createLions(int countLions) {
        ArrayList<Lion> lionsFactory = new ArrayList<>(countLions);
        for (int i = 0; i < countLions; i++) {
            lionsFactory.add(new Lion(2020, 10, 10, 10));
        }
        return lionsFactory;
    }
}
