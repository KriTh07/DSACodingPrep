package org.SimpleCodingQuestions.TwoPointers;

public class SquaresOfSortedArray {
    public static void main(String[] args){
        int[] nums = {-7, -3, 2, 3, 11};
        int n = nums.length -1;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int pos = n-1;

        while(left <= right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right]*nums[right];
            if(leftSq > rightSq){
                result[pos] = leftSq;
                left++;
            }
            else{
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }

        for(int r: result){
            System.out.println(r + " ");
        }
    }
}

/*
Example
Input: [-7, -3, 2, 3, 11]

leftSq=49, rightSq=121 → place 121 at result[4], right→3
leftSq=49, rightSq=9 → place 49 at result[3], left→1
leftSq=9, rightSq=9 → place 9 at result[2], right→2
leftSq=9, rightSq=4 → place 9 at result[1], left→2
leftSq=4 → place 4 at result[0]
Result: [4, 9, 9, 49, 121]

Edge cases:

Single element → just square and return.
All negatives or all positives → algorithm still works.
Zeroes included → fine.

Complexity:

Time: O(n) (single pass)
Space: O(n) (result array)
 */
