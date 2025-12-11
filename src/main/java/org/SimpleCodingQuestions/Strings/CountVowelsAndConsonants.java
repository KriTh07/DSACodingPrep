package org.SimpleCodingQuestions.Strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args){
        String str = "automation";
        //str = str.toLowerCase();  //needed when String is a combination of upper case and lowercase Chars

        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}

/*
Approach:
Convert string to lowercase.
Iterate through characters.
Check if a character is a vowel (a, e, i, o, u) or consonant.
 */

/*
**Key points:**
Simple iteration + conditional logic
Can be enhanced with Streams:
long vowels = s.chars()
               .filter(ch -> "aeiou".indexOf(ch) != -1)
               .count();
 */