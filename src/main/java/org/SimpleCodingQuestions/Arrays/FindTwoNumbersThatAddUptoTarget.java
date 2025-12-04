package org.SimpleCodingQuestions.Arrays;

import java.util.HashMap;

public class FindTwoNumbersThatAddUptoTarget {
    public static void main(String[] args) {
        int[] nums = {4, 5, 7, 10, 11};
        int target = 9;
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                System.out.println("pair found - " + complement + " and " + nums[i]);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("No pair found");
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