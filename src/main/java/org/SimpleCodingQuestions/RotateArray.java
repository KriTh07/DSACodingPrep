package org.SimpleCodingQuestions;
/**
 * We are given:
 * An integer array, A number k
 * We need to rotate (shift) the array to the right by k steps, meaning: Last k elements come to the front
 * Order must be preserved
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        for (int x : nums) System.out.print(x + " ");
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // normalize

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}

/*
⭐ Optimal Approach (Reverse Trick) — O(n)

Reverse whole array
[1 2 3 4 5 6 7] → [7 6 5 4 3 2 1]
Reverse first k elements
[7 6 5] → [5 6 7]
Reverse remaining n-k elements
[4 3 2 1] → [1 2 3 4]

Final:
[5 6 7 1 2 3 4]

Uses only swaps.
No extra array.
Perfect for interviews.
 */

/*
⭐ Think Through Examples (Pattern Spotting)
Example 1 (easy)
nums = [1,2,3], k = 1
→ [3,1,2]

Example 2
nums = [1,2,3,4,5], k = 2
→ [4,5,1,2,3]

Example 3 — Large k
nums = [10,20,30], k = 5
len = 3, so k = 5 % 3 = 2
→ [20,30,10]

Pattern:
Right rotate moves last k items to front.
 */

