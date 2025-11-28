package org.SimpleCodingQuestions.Strings;

public class StringReversal2 {
    public static void main(String[] args) {

        String str = "Hari Priya";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            StringBuilder rev = new StringBuilder(w);
            result.append(rev.reverse().toString()).append(" ");
        }

        System.out.println("Result is: " + result.toString().trim());
    }
}
