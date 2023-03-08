package Less_02.other;

import java.util.Comparator;

import Less_02.animals.Animal;

public class AnimalComporator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getYearBirth() > o2.getYearBirth())
		    return 1;
	    else if (o1.getYearBirth() < o2.getYearBirth())
		    return -1;
	    else
		    return 0;
    }
    
}
