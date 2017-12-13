package startOop.oop.myList;

public interface Linked<T> {
    void addLast(T t);

    void addFirst(T t);

    int size();

    T getElementByIndex(int counter);


}
