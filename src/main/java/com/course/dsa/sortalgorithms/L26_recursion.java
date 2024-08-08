package com.course.dsa.sort_algorithms;

public class L26_recursion {

    public static void main(String[] args) {

        int factorial = iterativeFactorial(25);
        int factorialRecursive = recursiveFactorial(25);
        System.out.println(factorial);
        System.out.println(factorialRecursive);

    }

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

}
