package org.SimpleCodingQuestionsRevision;

public class ReverseEachWordInAString {
    public static void main(String[] args){
        String input = "Hari Priya Muthukrishnan";
        String[] words = input.split(" ");
        StringBuilder rev = new StringBuilder();

        for (String w : words){
            rev.append(new StringBuilder(w).reverse().toString()).append(" ");
        }
        System.out.println("Reversed sentence: "+rev.toString().trim());
    }
}
