package org.SimpleCodingQuestions;

public class MoveZeroesToTheEndMaintainTheOrderOfNonZeroElements {
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};
        int j = 0;

        for (int i = 0; i <arr.length; i++){
            if (arr[i] !=0){
               int temp = arr[i];
                arr[i] = arr [j];
                arr[j] = temp;

                j++;
            }
        }
        for(int n : arr){
            System.out.println( n + " ");
        }
    }
}

/*
2️⃣ Approach (two pointer method)

Maintain two pointers:

i → iterates through array
j → next position to write non-zero
When arr[i] != 0:
Swap arr[i] and arr[j]
Increment j
All non-zeros get pushed forward naturally.
All zeros automatically get pushed towards the end.
 */

/*
🧠 5️⃣ Time & Space Complexity
Complexity	    Value
Time	        O(n) — single pass
Space	        O(1) — in-place
 */