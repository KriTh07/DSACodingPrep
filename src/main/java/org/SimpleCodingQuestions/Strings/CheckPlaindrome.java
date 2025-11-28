package org.SimpleCodingQuestions.Strings;

public class CheckPlaindrome {
    public static void main (String[] args){
        String str = "madam";
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() -1; i >=0 ; i--){
            rev.append(str.charAt(i));
        }
        /*
        To compare them with equals(), you must convert StringBuilder to String
        using rev.toString() because equals() between different types returns false.
         */
        if (str.equals(rev.toString())){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Not a plaindrome");
        }
    }
}
//String  --> Immutable (i.e., once assinged cannot be modified
//StringBuilder --> mutable (can change the content without creating new objects.)
// Optimized for modifications like append, insert, delete, reverse.
