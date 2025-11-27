package org.SimpleCodingQuestionsRevision;

public class FindSecondLargestNumber {
    public static void main(String[] args){
        int [] input = {4, 12, 10, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : input){
            if (n > largest){
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest = n;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }

}
