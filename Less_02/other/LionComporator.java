package Less_02.other;

import java.util.Comparator;

import Less_02.animals.Lion;

public class LionComporator implements Comparator<Lion>{

    @Override
    public int compare(Lion o1, Lion o2) {
        if (o1.getManeVolume() > o2.getManeVolume())
		    return 1;
	    else if (o1.getManeVolume() < o2.getManeVolume())
		    return -1;
	    else
		    return 0;
    }
    
}
