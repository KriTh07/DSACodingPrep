package org.SimpleCodingQuestions.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

/**
Problem: For each number, we want the first number to its right that is larger.
A stack helps because it remembers indices of elements that have not yet found their next greater number.
When a new number arrives, it may be the next greater for several earlier elements.
 **/

public class NextGreaterElementInArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = arr[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " → " + result[i]);
        }
    }
}

/*
Example

Input: [4, 5, 2, 25]
i=0 (4): push 0 → stack [0]
i=1 (5): 5>4 → pop 0 → result[0]=5, push 1 → stack [1]
i=2 (2): 2 not > 5 → push 2 → stack [1,2]
i=3 (25): 25>2 → pop 2 → result[2]=25; 25>5 → pop 1 → result[1]=25; push 3 → stack [3]
End → result[3] stays -1
Output: 4→5, 5→25, 2→25, 25→-1

Edge cases:

Strictly decreasing array → all -1.
Equal values → next greater must be strictly greater (not equal).

Complexity:

Time: O(n) (each index pushed and popped at most once)
Space: O(n) for stack and result
 */