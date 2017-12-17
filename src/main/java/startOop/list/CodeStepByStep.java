package startOop.list;

import java.util.*;

public class CodeStepByStep {

    public static void main(String[] args) {
        removeRangeA(5, 9);

//        removeRange(5, 9);

//        deleteDuplicates();

//        RemoveRange(2, 6);

//        Repeat(4);

//        Twice();

//        SwitchPairs();

        /*ArrayList<String> mirror = new ArrayList<String>();
        mirror.myAdd("a");
        mirror.myAdd("b");
        mirror.myAdd("c");
        Mirror(mirror);*/

       /* ArrayList<String> remove = new ArrayList<String>();
        remove.myAdd("hi");
        remove.myAdd("there");
        remove.myAdd("how");
        remove.myAdd("is");
        remove.myAdd("it");
        remove.myAdd("going");
        remove.myAdd("good");
        remove.myAdd("sirs");
        removeEvenLength(remove);*/

//        arrayListMysteryInsert();
    }

    private static void removeRangeA(int min, int max) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(11);
        set.add(16);

        System.out.println(set);

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int n = iter.next();
            if (n >= min & n <= max) {
                iter.remove();
            }
        }
        System.out.println(set);
    }

    private static void removeRange(int min, int max) {
        Set<Integer> list = new HashSet<Integer>();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }


        List<Integer> fromMinToMax = new LinkedList<Integer>();
        for (Integer elem : list) {
            if (elem >= min && elem <= max) {
                fromMinToMax.add(elem);
            }
        }
        list.removeAll(fromMinToMax);
        System.out.println(list);
    }

    private static void deleteDuplicates() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("be");
        list.add("be");
        list.add("is");
        list.add("not");
        list.add("or");
        list.add("or");
        list.add("thet");
        list.add("the");
        list.add("to");
        list.add("to");
        Set<String> setLine = new HashSet<String>();
        setLine.addAll(list);
        System.out.println(setLine);
    }

// Write a method named removeRange that accepts an ArrayList of integers and two integer values min and max
// as parameters and removes all elements values in the range min through max (inclusive).
// For example, if an ArrayList named list stores [7, 9, 4, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7],
// the call of removeRange(list, 5, 7); should change the list to store [9, 4, 2, 3, 1, 8].
    private static void RemoveRange(Integer min, Integer max) {
        ArrayList<Integer> removeMinMax = new ArrayList<Integer>();
        removeMinMax.add(1);
        removeMinMax.add(2);
        removeMinMax.add(4);
        removeMinMax.add(5);
        removeMinMax.add(6);
        removeMinMax.add(2);
        removeMinMax.add(4);
        removeMinMax.add(3);
        removeMinMax.add(4);
        removeMinMax.add(6);
        removeMinMax.add(5);
        for (int i = 0; i < removeMinMax.size() - 1; i++) {
            if (removeMinMax.get(i) == min || removeMinMax.get(i) == max) {
                removeMinMax.remove(removeMinMax.get(i));
            }
        }
        System.out.println(removeMinMax);
    }

// Write a method named repeat that accepts an ArrayList of Strings and an integer k as parameters
// and that replaces each element with k copies of that element. For example, if the list stores the values
// ["how", "are", "you?"] before the method is called and k is 4, it should store the values
// ["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"]
// after the method finishes executing. If k is 0 or negative, the list should be empty after the call.
    private static void Repeat(int count) {
        ArrayList<String> repeator = new ArrayList<String>();
        repeator.add("how");
        repeator.add("are");
        repeator.add("you");
        if (count == 0) {
            repeator.clear();
        } else {
            for (int i = 0; i < repeator.size(); i += count) {
                for (int j = 1; j < count; j++) {
                    repeator.add(i, repeator.get(i));
                }
            }
        }
        System.out.println(repeator);
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

