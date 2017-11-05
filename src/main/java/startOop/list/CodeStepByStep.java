package startOop.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeStepByStep {

    public static void main(String[] args) {

        Twice();

//        SwitchPairs();

        /*ArrayList<String> mirror = new ArrayList<String>();
        mirror.add("a");
        mirror.add("b");
        mirror.add("c");
        Mirror(mirror);*/

       /* ArrayList<String> remove = new ArrayList<String>();
        remove.add("hi");
        remove.add("there");
        remove.add("how");
        remove.add("is");
        remove.add("it");
        remove.add("going");
        remove.add("good");
        remove.add("sirs");
        removeEvenLength(remove);*/

//        arrayListMysteryInsert();
    }

    private static void Twice() {
        ArrayList<Integer> twiceList = new ArrayList<Integer>();
        twiceList.add(1);
        twiceList.add(2);
        twiceList.add(3);
        twiceList.add(4);
        ArrayList<Integer> finalTwiceList = new ArrayList<Integer>();
        finalTwiceList.addAll(twiceList);
        for (int i = 0; i < twiceList.size(); i++) {
            finalTwiceList.add(twiceList.get(i));
        }
        System.out.println(finalTwiceList);
    }

    // Write a method named switchPairs that accepts an ArrayList of strings as a parameter and switches the order
// of pairs of values in the array. Your method should swap the order of the first two values, then switch the order
// of the next two, and so on. For example, if the array stores {"a", "bb", "c", "ddd", "ee", "f", "g"},
// then the call of switchPairs(a); should switch the first pair ("a", "bb"), the second pair ("c", "ddd")
// and the third pair ("ee", "f"), to yield this list:
// {"bb", "a", "ddd", "c", "ee", "f", "g"}
    private static void SwitchPairs() {
        ArrayList<String> switchList = new ArrayList<String>();
        switchList.add("a");
        switchList.add("bb");
        switchList.add("k");
        switchList.add("dd");
        switchList.add("e");
        switchList.add("tt");
        switchList.add("o");
        switchList.add("qq");
        switchList.add("w");

        for (int i = 0; i < switchList.size() - 1; i++) {
            Collections.swap(switchList, i, ++i);
        }
        System.out.println(switchList);
    }

// Write a method named mirror that accepts an ArrayList of strings as a parameter and produces a mirrored copy of
// the list as output, with the original values followed by those same values in the opposite order.
// For example, if an ArrayList variable named list contains the values ["a", "b", "c"], after a call of mirror(list);
// it should contain ["a", "b", "c", "c", "b", "a"].
    private static void Mirror(ArrayList<String> mirrorList) {
        for (int i = mirrorList.size() - 1; i >= 0; i--) {
            mirrorList.add(mirrorList.get(i));
        }
        System.out.println(mirrorList);
    }

// Write a method named removeEvenLength that accepts an ArrayList of strings as a parameter and that removes all
// of the strings of even length from the list. For example, if an ArrayList variable named list contains the values
// ["hi", "there", "how", "is", "it", "going", "good", "sirs"], the call of removeEvenLength(list); would change it to store
// ["there", "how", "going"].
    private static void removeEvenLength(ArrayList<String> listRemove) {
        System.out.println(listRemove);
       for (int i = 0; i < listRemove.size(); i++) {
           if (listRemove.get(i).length() % 2 == 0) {
               listRemove.remove(i);
               i--;
           }
        }
        System.out.println(listRemove);
    }


    private static void arrayListMysteryInsert() {
        ArrayList<Integer> vec = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            vec.add(i * 2);
        }
        int size = vec.size();
        for (int i = 0; i < size; i++) {
            vec.add(i, 42);
        }
        System.out.println(vec);
    }
}

