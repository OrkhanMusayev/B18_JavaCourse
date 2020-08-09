package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {

//Queue(I): does not have index numbers, size is dynamic, accepts duplicates, First in first out order
// Poll(): removes the first object in the queue.
        Queue<String> q = new PriorityQueue<>(); // FIFO
        q.add("D");
        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q);

        String str = q.poll(); //A
        System.out.println(str );

        System.out.println(q);

        //System.out.println(q.get(0));



    }
}