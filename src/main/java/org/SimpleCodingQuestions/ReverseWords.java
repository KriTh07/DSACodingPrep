package org.SimpleCodingQuestions;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hari Priya Muthukrishnan";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
