package com.course.datastructures.queue;

public class Main {

    public static void main(String[] args) {

        // Queue
        Queue queue = new Queue(2);
        queue.enqueue(1);

        // (2) items - returns 2 Node
        System.out.println(queue.dequeue().value);
        // (1) item - returns 1 Node
        System.out.println(queue.dequeue().value);
        // (0) items - returns null
        System.out.println(queue.dequeue());

        queue.printQueue();
    }

}
