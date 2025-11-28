package org.SimpleCodingQuestions.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] input = {1, 2, 3, 5};
        Arrays.sort(input);

        int min = input[0];
        int max = input[input.length-1];

        HashSet<Integer> set = new HashSet<>();
        for(int n : input){
            set.add(n);
        }
        System.out.println("Missing numbers:");
        for (int i = min; i <= max;  i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
