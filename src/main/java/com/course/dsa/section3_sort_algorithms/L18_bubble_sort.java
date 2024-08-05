package com.course.dsa.section3_sort_algorithms;

import java.util.Arrays;
import java.util.Random;

public class L18_bubble_sort {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-100, 100);
        }
        System.out.println("array before sorting: " + Arrays.toString(intArray));

        // bubble sort
        int decrementableIndex = intArray.length;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < decrementableIndex; j++) {
                if ((j + 1) < intArray.length) {
                    int left = intArray[j];
                    int right = intArray[j + 1];
                    if (left > right) {
                        intArray[j + 1] = left;
                        intArray[j] = right;
                    }
                }
            }
            decrementableIndex--;
        }

        System.out.println("array after sort: " + Arrays.toString(intArray));
    }

}
