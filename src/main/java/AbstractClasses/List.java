package AbstractClasses;

import Interfaces.Node;

/**
 *
 * Created by INV-6179 on 04.03.2016.
 */
public abstract class List<E> implements Interfaces.List<E> {
    protected int size;

    public int getSize(){
        return size;
    }

    public abstract void addElement(E o);

    public abstract void removeElement(int index);

    public abstract void removeFirst();

    public abstract void clear();

    public abstract boolean contains(E o);

    public abstract boolean isEmpty();

    public abstract E get(int index);

    public abstract void set(int index,E o);
}
