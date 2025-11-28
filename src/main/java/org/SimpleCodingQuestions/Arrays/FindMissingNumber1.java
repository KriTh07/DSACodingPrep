package org.SimpleCodingQuestions.Arrays;

public class FindMissingNumber1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = arr.length + 1;  // because one number is missing

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
