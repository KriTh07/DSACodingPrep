package org.SimpleCodingQuestionsRevision;

public class FindSumOfGivenDigits {
    public static void main(String[] args){
        int input = 45678;
        int sum = 0;

        while(input > 0){
            int digit = input % 10; //extracts the last digit
            sum += digit;
            input = input /10; //removes the last digit
        }
        System.out.println(sum);
    }
}
/*
Notes:
%10 extracts the last digit
/10 removes the last digit
Works for any positive integer
For negative numbers, you can use Math.abs(n)
 */

/*
| Step | n    | digit (n%10) | sum | n after n/10 |
| ---- | ---- | ------------ | --- | ------------ |
| 1    | 1234 | 4            | 4   | 123          |
| 2    | 123  | 3            | 7   | 12           |
| 3    | 12   | 2            | 9   | 1            |
| 4    | 1    | 1            | 10  | 0            |
✅ Output → 10
 */
