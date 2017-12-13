package startOop.oop.myList;

public class MyLinkedContainer<T> implements Linked<T> {

    private Node<T> fstNode;
    private Node<T> lstNode;
    private int size = 0;

    public MyLinkedContainer() {
        lstNode = new Node<T>(null, fstNode, null);
        fstNode = new Node<T>(null, null, lstNode);
    }

    @Override
    public void addLast(T t) {
        Node<T> prev = lstNode;
        prev.setCurrentElement(t);
        lstNode = new Node<T>(null,  null, prev);
        prev.setNextElement(lstNode);
        size++;
    }

    @Override
    public void addFirst(T t) {
        Node<T> next = fstNode;
        next.setCurrentElement(t);
        fstNode = new Node<T>(null, next, null);
        next.setPrevElement(fstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int counter) {
        Node<T> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<T> getNextElement(Node<T> current) {
        return current.getNextElement();
    }


    private class Node<T> {
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;

        public Node(T currentElement, Node<T> nextElement, Node<T> prevElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public T getCurrentElement() { return currentElement; }
        public void setCurrentElement(T currentElement) { this.currentElement = currentElement; }
        public Node<T> getNextElement() { return nextElement; }
        public void setNextElement(Node<T> nextElement) { this.nextElement = nextElement; }
        public Node<T> getPrevElement() { return prevElement; }
        public void setPrevElement(Node<T> prevElement) { this.prevElement = prevElement; }
    }
}

