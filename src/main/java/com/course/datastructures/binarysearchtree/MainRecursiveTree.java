package com.course.datastructures.binarysearchtree;

public class MainRecursiveTree {

    public static void main(String[] args) {

        testingDFSInOrder();

    }

    public static void testingDFSInOrder() {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println(bst.DFSInOrder());

    }

    public static void testingDFSPostOrder() {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println(bst.DFSPostOrder());

    }

    public static void testingDFSPreOrder() {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println(bst.DFSPreOrder());

    }

    public static void testingBFS() {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println(bst.BFS());

    }

    public static void testingRecursive() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.rInsert(2);
        bst.rInsert(1);
        bst.rInsert(3);

        bst.deleteNode(2);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                        2
                      /   \
                     1     3
         */

        System.out.println("Root: " + bst.root.value);
        System.out.println("Root->Left: " + bst.root.left.value);
        System.out.println("Root->Right: " + bst.root.right);
    }

}
