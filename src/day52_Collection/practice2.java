package day52_Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Methods in Queue:
 * add()- This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation.
 * peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
 * element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
 * remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.
 * poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
 * size()- This method return the no. of elements in the queue.
 */
public class practice2 {

    public static void main(String[] args) {


//        Queue<String> q = new LinkedList<String>();
//
//        //Adding elements to the Queue
//        q.add("Ramil");
//        q.add("Solmaz");
//        q.add("Ilham");
//        q.add("Kenan");
//        q.add("Venera");
//
//        System.out.println("Elements :"+q);
//
//        System.out.println("==========================================");
//
//        System.out.println("Removed element: "+q.remove());
//
//        System.out.println("==========================================");
//
//        System.out.println("Head: "+q.element());
//
//        System.out.println("==========================================");
//
//        System.out.println("poll(): "+q.poll());
//
//        System.out.println("==========================================");
//
//        System.out.println("peek(): "+q.peek());
//
//        System.out.println("==========================================");
//
//        System.out.println("Elements in Queue:"+q);

        Queue<String> q = new PriorityQueue<>();
        q.add("e");
        q.add("r");
        q.add("a");
        q.add("b");
        q.add("c");

        System.out.println("PriorityQueue: " + q);

        String b = q.poll();

        System.out.println("PriorityQueue: " + b);

        String c = q.poll();

        System.out.println("PriorityQueue: " + c);

        String d = q.poll();

        System.out.println("PriorityQueue: " + d);






    }
}
