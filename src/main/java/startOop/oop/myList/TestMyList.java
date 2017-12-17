package startOop.oop.myList;

public class TestMyList {

    public static void main(String[] args) {

        Linked<String> linked = new MyLinkedContainer<>();
        linked.addLast("1");
        linked.addFirst("2");
        System.out.println(linked.size());
        System.out.println(linked.getElementByIndex(0));
    }
}
