package org.SimpleCodingQuestions.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        Set<Integer> set = new HashSet<>();
        Integer firstRepeated = null;
        for (int n : nums) {
            if (!set.add(n)) {
                firstRepeated = n;
                break;
            }
        }
        System.out.println(firstRepeated);
    }
}
