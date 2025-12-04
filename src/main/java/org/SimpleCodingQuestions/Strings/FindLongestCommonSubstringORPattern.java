package org.SimpleCodingQuestions.Strings;
import java.util.Set;
import java.util.HashSet;

public class FindLongestCommonSubstringORPattern {
    public static void main(String[] args){
        String input = "dfjdhg kgkdfjhg kjgfdkgh djfhdkgj";
        String [] words = input.split(" ");
        // Step 1: Find the shortest word
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        // Step 2: Generate all substrings of shortest word
        Set<String> commonSet = new HashSet<>();
        int n = shortest.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                commonSet.add(shortest.substring(i, j));
            }
        }
        // Step 3: Intersect with substrings of other words
        for (String word : words) {
            Set<String> tempSet = new HashSet<>();
            int m = word.length();
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j <= m; j++) {
                    String sub = word.substring(i, j);
                    if (commonSet.contains(sub)) {
                        tempSet.add(sub);
                    }
                }
            }
            commonSet = tempSet; // retain only common substrings
        }
        // Step 4: Find longest substring
        String longestCommon = "";
        for (String sub : commonSet) {
            if (sub.length() > longestCommon.length()) {
                longestCommon = sub;
            }
        }

        System.out.println("Longest common substring: " + longestCommon);
    }
}
/*
Idea
- Split the string into words.
- Pick the shortest word (since the longest common substring must be inside it).
- Generate all substrings of the shortest word and store them in a HashSet.
- For each of the other words:
- Generate substrings of that word.
- Intersect with the existing set (retain only common substrings).
- At the end, the set contains substrings common to all words.
- Return the longest substring from the set.

 */