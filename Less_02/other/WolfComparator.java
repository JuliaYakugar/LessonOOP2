package Less_02.other;

import java.util.Comparator;

import Less_02.animals.Wolf;

public class WolfComparator implements Comparator<Wolf>{

    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getWeightAnimal() > o2.getWeightAnimal())
            return 1;
        else if (o1.getWeightAnimal() < o2.getWeightAnimal())
            return -1;
        else if  (o1.getYearBirth() > o2.getYearBirth())
            return 1;
        else if (o1.getYearBirth() < o2.getYearBirth())
            return -1;
        else
            return 0;
    } 
    
}
