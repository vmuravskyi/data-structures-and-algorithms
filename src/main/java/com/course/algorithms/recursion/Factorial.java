package com.course.algorithms.recursion;

public class Factorial {

    public static void main(String[] args) {
        int factorial = factorial(10);
        System.out.println(factorial);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
