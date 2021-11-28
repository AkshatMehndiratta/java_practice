package queue;

import java.util.LinkedList;
import java.util.Queue;

public class linkedlist {
    public static void main(String[] args) {
//        linked list is also implemented by queue so we can call it y queue reference also
        Queue<Integer> linkedList = new LinkedList<>();
//        adding element in queue we can use it by add() method also but it throws exception if queue is null
        linkedList.offer(10);
        linkedList.offer(20);
        linkedList.offer(30);
        linkedList.offer(40);
//        removes element next in line we can use it by remove() method also but it throws exception if queue is null
        linkedList.poll();
//        returns next element in line to be poll we can use it by element() method also but it throws exception if queue is null
        linkedList.peek();
//        this method returns true if list contains element else return false
        linkedList.contains(30);
//        it clears all elements of the list
        linkedList.clear();
//        returns true if list is empty else false
        linkedList.isEmpty();
    }
}
