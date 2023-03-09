package Less_02.other;

import java.util.Iterator;
import java.util.List;

import Less_02.animals.Wolf;

public class WolfIterator implements Iterator<Wolf> {

    private List<Wolf> wolfs;

    private int index;

    public WolfIterator(List<Wolf> wolfs) {
        this.wolfs = wolfs;
   }

    @Override
    public boolean hasNext() {
        return index < wolfs.size();
    }

    @Override
    public Wolf next() {
        return wolfs.get(index++);
    }
    
}
