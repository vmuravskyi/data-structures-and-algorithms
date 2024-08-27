package com.course.algorithms.other.sortalgorithms;

import java.util.Random;

public class Utils {

    private Utils() {
        // private
    }

    public static int[] arrayWithRandomIntValues(int arrayLength) {
        int[] intArray = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-1000, 1000);
        }
        return intArray;
    }

    public static long timeMillis() {
        return System.currentTimeMillis();
    }

    public static void printTime(long timeBefore, long timeAfter) {
        System.out.printf("time difference: %d\n", (timeAfter - timeBefore));
    }

}
