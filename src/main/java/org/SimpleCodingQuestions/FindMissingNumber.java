package org.SimpleCodingQuestions;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length + 1;   // because one number is missing

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int k : arr) {
                if (k == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing number: " + i);
                break;
            }
        }
    }
}
