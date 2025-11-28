package org.SimpleCodingQuestions.Arrays;

public class Find2ndLargestNumber {
    public static void main(String[] args){
        int[] arr = {10, 5, 8, 20, 3};
        /* We initialize largest and secondLargest with the
         smallest possible integer so that any number in the array will be bigger. */
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //num will take values 10, 5, 8, 20, 3 one by one.
        for (int num : arr) {
            if (num > largest) {
                /* If the current number is bigger than largest,
                move the old largest into secondLargest update largest to the current number */
                secondLargest = largest;
                largest = num;
            }
            /*If current number is not the largest but bigger than secondLargest, update secondLargest.
            num != largest ensures we don’t pick the same number twice.*/
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number: " + secondLargest);

    }
}
