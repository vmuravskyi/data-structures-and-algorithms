package com.course.algorithms.bigO.l11_O_of_n;

public class Main {

    public static void main(String[] args) {
        printItems(10);
    }

    public static void printItems(int n) {
        for (int i = 1; i < n; i *= 2) {  // Exponential growth: i = 1, 2, 4, 8, ..., < n
            System.out.println("i: " + i);
        }
    }

}
