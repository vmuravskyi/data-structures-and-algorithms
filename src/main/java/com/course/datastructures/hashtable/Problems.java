package com.course.datastructures.hashtable;

import java.util.HashMap;

public class Problems {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        System.out.println(itemsInCommon(array1, array2));
        System.out.println(itemsInCommonHashtable(array1, array2));

    }

    private static boolean itemsInCommon(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean itemsInCommonHashtable(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i : array1) {
            hashMap.put(i, true);
        }

        for (int j : array2) {
            if (hashMap.get(j) != null) {
                return true;
            }
        }
        return false;
    }

}
