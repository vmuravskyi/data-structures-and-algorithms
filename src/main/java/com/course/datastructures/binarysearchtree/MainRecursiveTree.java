package com.course.datastructures.binarysearchtree;

public class MainRecursiveTree {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.rInsert(2);
        bst.rInsert(1);
        bst.rInsert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                        2
                      /   \
                     1     3
         */

        System.out.println("Root: " + bst.root.value);
        System.out.println("Root->Left: " + bst.root.left.value);
        System.out.println("Root->Right: " + bst.root.right.value);

    }

}
