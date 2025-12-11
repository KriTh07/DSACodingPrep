package org.SimpleCodingQuestions.TwoPointers;

public class RemoveElementInArray {
    public static void main(String[] args){
        int[] nums = {3, 2, 2, 3, 4, 3};
        int val = 3;

        int j =0 ;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!= val){
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println("New Length:" + j);
        for(int i =0 ; i<j; i++){
            System.out.println(nums[i] + " ");
        }
    }
}

/*
Example
Array:
[2, 3, 3, 5, 3, 2]

Count:
2 → appears 2 times
3 → appears 3 times
5 → appears 1 time
Most frequent = 3
 */