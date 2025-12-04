package org.SimpleCodingQuestions.Strings;
import java.util.Set;
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChars {
        public static void main (String [] args) {
            String s = "abcabcbb";
            Set<Character> set = new HashSet<>();

            int left = 0;
            int maxLen = 0;
            int startIndex = 0;  // where the best substring starts

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                // If duplicate, shrink window from the left
                while (set.contains(c)) {
                    set.remove(s.charAt(left));
                    left++;
                }

                // Add the new character
                set.add(c);

                // Update max length
                maxLen = Math.max(maxLen, right - left + 1);

                // update best window
                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    startIndex = left;
                }
            }
            System.out.println("Longest Substring is: "+ s.substring(startIndex, startIndex + maxLen));
            System.out.println("MaxLength is: " + maxLen);


        }
    }

/*
🎯 Quick dry-run (so you fully understand)

Take: "pwwkew"

p     → no duplicate → max=1
pw    → no duplicate → max=2
pww   → 'w' duplicate → remove left 'p'
 w w → 'w' duplicate → remove left 'w'
  w k → max=2
  wk e w


final max = 3 → "wke"
 */