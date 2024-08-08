package com.course.dsa.sortalgorithms;

import static com.course.dsa.sortalgorithms.Utils.arrayWithRandomIntValues;

public class L18_bubble_sort {

    public static void main(String[] args) {

        int[] intArray = arrayWithRandomIntValues(100);

        bubbleSort(intArray);
    }

    private static void bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
