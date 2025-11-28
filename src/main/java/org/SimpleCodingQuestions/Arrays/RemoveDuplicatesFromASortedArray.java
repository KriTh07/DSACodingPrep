package org.SimpleCodingQuestions.Arrays;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4};
        int j = 0;

        for (int i =0; i <arr.length ; i++){
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        int unique = j +1 ;
        System.out.println(unique);
        for (int i = 0; i < unique; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/* ❤️ Easy Visual
[1,1,2,2,2,3,4,4,5]
 j
 i
Same -> don't increment j

[1,1,2,2,2,3,4,4,5]
 j
     i
Different -> increment j
Write arr[i] at arr[j]
 */
