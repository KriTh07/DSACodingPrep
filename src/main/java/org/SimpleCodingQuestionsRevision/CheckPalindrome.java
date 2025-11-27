package org.SimpleCodingQuestionsRevision;

public class CheckPalindrome {
    public static void main(String[] args){
        String input = "madam";
        StringBuilder rev = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i --){
            rev.append(input.charAt(i));
        }
        if (input.equals(rev.toString())){
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
