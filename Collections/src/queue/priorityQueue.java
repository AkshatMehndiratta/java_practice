package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
/*        we make a queue in which order is not preserved but elements are removed in a priority which
          is in ascending order*/
        Queue<Integer> priorityQueue = new PriorityQueue<>();
//        adding elements in queue
        priorityQueue.offer(10);
        priorityQueue.offer(6);
        priorityQueue.offer(3);
        priorityQueue.offer(5);
        priorityQueue.offer(9);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(50);
//        printing queue
        System.out.println(priorityQueue);
//        removing and printing element next in queue according to priority
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
//        printing next element in queue to be poll
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.isEmpty());
//        clearing queue
        priorityQueue.clear();
        System.out.println(priorityQueue.isEmpty());
    }
}
