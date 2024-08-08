package com.course.dsa.sortalgorithms;

import static com.course.dsa.sortalgorithms.Utils.printTime;
import static com.course.dsa.sortalgorithms.Utils.timeMillis;

public class L22_insertion_sort {

    public static void main(String[] args) {

        int[] intArray = Utils.arrayWithRandomIntValues(1000);
        long before = timeMillis();

        // insertion sort
        insertionSort(intArray);

        printTime(before, timeMillis());
    }

    private static void insertionSort(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
    }

}
