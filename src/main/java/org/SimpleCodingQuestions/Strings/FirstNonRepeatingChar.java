package org.SimpleCodingQuestions.Strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args){
        String str = "swiss";

        int[] freq = new int[26];

        // 1. count frequency
        for (char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        // 2. find the first non-repeating character
        char result = ' '; //placeholder
        for (char c : str.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                result = c;
                break;
            }
        }
        System.out.println(result);
    }
}

/*
🧠 Dry Run (quick)
s = "swiss"

Frequency:
s → 3
w → 1
i → 1

Second loop:
s → freq = 3 → skip
w → freq = 1 → return w
 */
