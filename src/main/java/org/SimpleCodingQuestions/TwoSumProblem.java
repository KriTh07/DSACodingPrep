package org.SimpleCodingQuestions;

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
