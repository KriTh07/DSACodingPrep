package org.SimpleCodingQuestions;

public class SumOfDigits {
    public static void main(String[] args){
        int number = 328473;
        int sum = 0;

        while(number > 0){
            int digit = number % 10; // extract last digit
            sum += digit;           // add to sum
            number = number / 10;  // remove last digit
        }
        System.out.println("Sum is:" + sum);
    }
}

/*
% 10 → extract last digit
/ 10 → remove last digit
Together → process all digits of a number easily
 */