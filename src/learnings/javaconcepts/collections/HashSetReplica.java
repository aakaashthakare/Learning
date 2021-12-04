package learnings.javaconcepts.collections;

import java.util.HashMap;

public class HashSetReplica<E> {
    private transient HashMap<E,Object> map;
    private static final Object PRESENT = new Object();

    public HashSetReplica(){
        map = new HashMap<>();
    }
    public  HashSetReplica(int initialCapacity){
        map = new HashMap<>(initialCapacity);
    }
    public HashSetReplica(int initialCapacity, float loadFactor){
        map = new HashMap<>(initialCapacity, loadFactor);
    }
    public boolean add(E e){
        return map.put(e, PRESENT) == null;
    }
    public boolean remove(Object o){
        return map.remove(o) == PRESENT;
    }

}
