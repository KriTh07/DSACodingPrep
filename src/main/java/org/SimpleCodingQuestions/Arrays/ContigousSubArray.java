package org.SimpleCodingQuestions.Arrays;
/**
 * Kadane’s Algorithm
 */
public class ContigousSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, -2, 7, 8};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int n :arr){
            currentSum = Math.max(n, currentSum + n);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max contiguous subarray sum = " + maxSum);
    }
}


/*
✅ Problem
Given an integer array, find the maximum sum of any contiguous subarray.
Example:
[2, 3, -1, -2, 7, 8] → 17 (the subarray is [2,3,-1,-2,7,8])

🌟 What is a “contiguous subarray”?
It means elements that sit next to each other in order.You cannot skip.
Like a substring in a string → continuous.

Examples of contiguous:
✔ [3, -1, -2]
✔ [7, 8]
✖ 3, -2, 8 → NOT contiguous.

❤️ Kadane’s Algorithm — The Easiest Way
We track two things:
1️⃣ currentSum
Best sum including the current element.
If currentSum becomes negative → drop it and restart from current element.
2️⃣ maxSum
The best sum seen so far.

✅ Algorithm Steps
For each number n:
currentSum = max(n, currentSum + n)
maxSum = max(maxSum, currentSum)
That's it.
 */

/*
🎯 Kadane’s Shortcut (NEVER forget this)

At each index i: We have 2 choices:
1) Extend the previous subarray  → sum + arr[i]
2) Start a new subarray at i    → arr[i]

We pick the larger one. That’s it!

🔥 Answer for your example
Array:
[2, 3, -1, -2, 7, 8]

Running Kadane:
i	val	    localMax = max(val, val + localMax)	    globalMax
0	2	        max(2, 2) = 2	                        2
1	3	        max(3, 2+3=5) = 5	                    5
2	-1	        max(-1, 5-1=4) = 4	                    5
3	-2	        max(-2, 4-2=2) = 2	                    5
4	7	        max(7, 2+7=9) = 9	                    9
5	8	        max(8, 9+8=17) = 17	                    17
⭐ Final Answer

Maximum sum = 17
Subarray = [2, 3, -1, -2, 7, 8] (entire array)
 */