package Interfaces;

/**
 * Created by INV-6179 on 03.03.2016.
 */
public interface List<E> {
    /**
     * Return size of List
     * @return size of list
     */
    int getSize();

    void addElement(E o);

    void removeElement(int index);

    void removeFirst();

    void clear();

    boolean contains(E o);

    boolean isEmpty();

    E get(int index);

    void set(int index,E o);

}
