package org.SimpleCodingQuestionsRevision;

import java.util.Arrays;
import java.util.HashSet;

public class FindNumbersMissingBetweenMinAndMax {
    // One stop solution to find missing numbers problem
    public static void main(String[] args){
        int[] input = {15, 3, 9, 10, 12};
        //int[] input = {1, 3, 4, 5};
        Arrays.sort(input);

        int min = input[0];
        int max = input[input.length -1];
        /*
         if you use input.length directly, you are bound to get
         ArrayIndexOutOfBoundException as arrays get stored in 0, 1, 2, 3 etc.
        */
        HashSet<Integer> set = new HashSet<>();
        for (int n : input){
            set.add(n);
        }
        System.out.println("Missing numbers are: ");
        for (int i = min; i <=max; i++){
            if (!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
/*
Java arrays are zero-indexed, so the last element is always at index length -
1. Using length would access an invalid index and cause an ArrayIndexOutOfBoundsException
 */

/*
Example
int[] arr = {4, 6, 8, 10};
Here:
arr.length = 4

Valid indices:
Index: 0   1   2   3
Value: 4   6   8   10

So:
Expression	Refers to	Valid?
arr[0]	1st element	✔
arr[3]	last element	✔
arr[arr.length - 1] → arr[3]	last element	✔
arr[arr.length] → arr[4]	❌ OUT OF RANGE	❌ Throws exception
❌ What happens if you use arr[arr.length] ?

You get:
java.lang.ArrayIndexOutOfBoundsException

Because index 4 does NOT exist.
 */
