package com.course.datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList ddl = new DoubleLinkedList(7);
        ddl.append(2);
        ddl.prepend(3);
        ddl.prepend(3);

        System.out.println(ddl.get(3).getValue());
        System.out.println();

        ddl.removeFirst();
        ddl.removeFirst();

        ddl.printList();

    }

}
