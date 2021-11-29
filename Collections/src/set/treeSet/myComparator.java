package set.treeSet;

import java.util.Comparator;

public class myComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        if(i1<i2)
            return 1;
        else if(i2<i1)
            return -1;
        else
            return 0;
    }
}

