package set.treeSet;

import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {
//        tree set in reverse sorting order
        TreeSet<Integer> t = new TreeSet<Integer>(new myComparator());
        t.add(100);
        t.add(500);
        t.add(600);
        t.add(400);
        t.add(90);
        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.contains(500));
        t.remove(600);
        System.out.println(t);
        t.clear();
        System.out.println(t.isEmpty());
    }
}
