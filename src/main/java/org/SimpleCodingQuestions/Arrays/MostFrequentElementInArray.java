package org.SimpleCodingQuestions.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 4, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);

        int maxCount = 0, result = nums[0];
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                result = e.getKey();
            }
        }
        System.out.println(result);
    }
}
