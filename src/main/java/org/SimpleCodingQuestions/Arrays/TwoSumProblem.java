package org.SimpleCodingQuestions.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumProblem {
    public static void findPairIndices(int[] num, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< num.length; i++){
            int complement = target - num[i];

            if(map.containsKey(complement)){
                System.out.println("Pair found at the indices - " + map.get(complement));
                return;
            }
            map.put(num[i], i);
        }

    }
    public static void findPairNumbers(int[] num, int target){
        HashSet<Integer> set = new HashSet<>();

        for (int nums : num){
            int complement = target - nums;

            if(set.contains(complement)){
                System.out.println("Pair found : " +complement + " and " + nums);
                return;
            }
            set.add(nums);
        }

    }
    public static void main(String[] args){
        int[] num = {1, 2, 7, 9, 11, 17};
        int target = 9;

        System.out.println("Using HashMap (return indices):");
        findPairIndices(num, target);

        System.out.println("\nUsing HashSet (return numbers):");
        findPairNumbers(num, target);
    }
}

/*
Interview Notes
Time Complexity: O(n) — single pass
Space Complexity: O(n) — HashMap
Works perfectly for any array of integers
 */


/*
nums = [2, 7, 11, 15], target = 9
i	nums[i]	complement = 9 - nums[i]	In Map?	Map after this step
0	2	                        7	        No	    {2→0}
1	7	                        2	        Yes	    {2→0, 7→1}
✅ Found pair → 2 and 7
 */