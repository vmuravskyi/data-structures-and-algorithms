package com.course.datastructures.stack;

import com.course.datastructures.queue.Queue;

public class Main {

    public static void main(String[] args) {

        // Stack
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);

        stack.getHeight();
        stack.getTop();
        stack.printStack();

    }

}
