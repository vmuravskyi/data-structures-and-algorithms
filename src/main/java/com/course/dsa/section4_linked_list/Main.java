package com.course.dsa.section4_linked_list;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(1);


        System.out.println(linkedList.removeFirst().value);
        System.out.println(linkedList.removeFirst().value);
        System.out.println(linkedList.removeFirst());
    }

}
