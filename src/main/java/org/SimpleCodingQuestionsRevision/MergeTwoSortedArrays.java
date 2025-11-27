package org.SimpleCodingQuestionsRevision;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 8};
        int[] arr2 = {3, 5, 6, 7};

        int i = 0, j = 0;
        List<Integer> merged = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged.add(arr1[i]);
                i++;
            } else {
                merged.add(arr2[j]);
                j++;
            }
        }
        // Add remaining elements
        while (i < arr1.length) {
            merged.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            merged.add(arr2[j]);
            j++;
        }
        System.out.println(merged);
    }
}
