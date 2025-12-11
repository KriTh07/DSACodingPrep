package org.SimpleCodingQuestions.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";

        int left = 0;
        int right = s.length() -1;

        while(left < right){
            //skip NON alphanumeric
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            //skip NON alphanumeric
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                System.out.println("false");
                return;
            }
            left++;
            right --;
        }
        System.out.println("true");
    }
}
