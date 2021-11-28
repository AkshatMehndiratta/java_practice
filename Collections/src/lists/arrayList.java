package lists;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
//        declaring ArrayList using parent reference we can also declare it by using reference of ArrayList itself
        List<Integer> l = new ArrayList<>();
//        Adding elements to the array list
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(13);
        l.add(12);
        l.add(11);
//        repetition of elements are allowed
//        printing ArrayList
        System.out.println(l);
//        removing elements from ArrayList
        l.remove(2);
        System.out.println(l);
//        this method returns true if list contains element else return false
        System.out.println(l.contains(14));
        System.out.println(l.contains(10));
//        this method set value at specific index
        l.set(2,15);
        System.out.println(l);
//        returns value at specific index
        System.out.println(l.get(2));

//        it returns size of list
        System.out.println(l.size());
//        returns true if list is empty else false
        System.out.println(l.isEmpty());
//        it clears all elements of the list
        l.clear();
        System.out.println(l);
        System.out.println(l.isEmpty());
    }
}
