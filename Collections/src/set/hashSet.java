package set;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
//        declaring a set
        Set<Integer> s =new HashSet<>();
//        adding element in set(order is not preserved)
        s.add(50);
        s.add(40);
        s.add(60);
        s.add(10);
        s.add(500);
//        duplicates are not allowed
        s.add(50);
        System.out.println(s);
//        removing element from set
        s.remove(40);
        System.out.println(s);
//        it number of returns elements in set
        System.out.println(s.size());
//        return true if set contains element else false
        System.out.println(s.contains(10));
        System.out.println(s.contains(40));
//        returns true if set is empty else false
        System.out.println(s.isEmpty());
//        clears all elements in set
        s.clear();
        System.out.println(s.isEmpty());
    }
}
