package com.course.dsa.section4_linked_list;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);
        linkedList.append(123);

        linkedList.insert(1, 4);
        linkedList.remove(1);


        linkedList.printList();

        linkedList.reverse();
        System.out.println();
        linkedList.printList();

    }

}
