package org.SimpleCodingQuestions.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        for (int n : nums) {
            if (!set.add(n)) {
                hasDuplicate = true;
                break;
            }
        }
        System.out.println(hasDuplicate);
    }
}
