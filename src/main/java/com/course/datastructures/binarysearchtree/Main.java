package com.course.datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

         /*
            THE LINES BELOW CREATE THIS TREE:
                         47
                       /    \
                     21     76
                   /   \   /    \
                  18   27 52    82
        */

        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Root = " + bst.root);

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);

        bst.insert(27);

        System.out.println(bst.root.left.right.value);
    }

}
