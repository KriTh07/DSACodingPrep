package org.SimpleCodingQuestions.Strings;

public class SimpleStringManipulations {
        public static void main(String[] args) {
            String str = " Hello World " ;
            String concatenated = str + "!";
            String substring = str.substring(1, 6);
            String replaced = str.replace("World", "Java");
            String upper = str.toUpperCase();
            String lower = str.toLowerCase();
            String trimmed = str.trim();
            String[] split = str.trim().split(" ");

            System.out.println("Concatenated: " + concatenated);
            System.out.println("Substring: " + substring);
            System.out.println("Replaced: " + replaced);
            System.out.println("Uppercase: " + upper);
            System.out.println("Lowercase: " + lower);
            System.out.println("Trimmed: " + trimmed);
            System.out.print("Split words: ");
            for (String word : split) {
                System.out.print(word + " ");

            }
        }
}
