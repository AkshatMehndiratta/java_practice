package lists;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String[] args) {
//        declaring LinkedList using parent reference we can also declare it by using reference of linkedList itself
        List<Integer> l = new LinkedList<>();
//        Adding elements to the linked list
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(30);
        l.add(20);
        l.add(10);
//        repetition of elements are allowed
//        printing linkedList
        System.out.println(l);
//        removing elements from LinkedList
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
