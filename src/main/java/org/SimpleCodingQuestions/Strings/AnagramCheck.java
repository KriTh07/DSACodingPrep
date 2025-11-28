package org.SimpleCodingQuestions.Strings;

public class AnagramCheck {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        int[] freq = new int[26]; // for 'a' to 'z'

        for (char c : s1.toCharArray()){
            freq[c - 'a']++;
        }
        for (char c : s2.toCharArray()){
            freq[c - 'a']--;
        }
        for (int f : freq){
            if (f!=0){
                System.out.println("Not an Anagram");
            }
        }
        System.out.println("Its an Anagram");
    }
}
//This method is O(n) and faster than sorting (O(n log n)), especially for long strings.
/*
Here’s what happens:
1️⃣ c - 'a'
'a' has ASCII value 97, 'b' is 98, … 'z' is 122.
If c = 'c', then c - 'a' = 99 - 97 = 2.
So the array index corresponds to the letter.
freq[0] → count of 'a'
freq[1] → count of 'b'
…

2️⃣ freq[c - 'a']++
For the first string (s1), every time a character appears, increment the count at that index.
Example: s1 = "hello"
'h' → freq[7]++
'e' → freq[4]++
'l' → freq[11]++ (twice)
'o' → freq[14]++
So freq now stores how many times each letter appears in s1.

3️⃣ freq[c - 'a']--
For the second string (s2), decrement the count for each character.
Idea: if s2 has the exact same letters as s1, the increments and decrements will cancel out.
Example: s2 = "olleh"
'o' → freq[14]--
'l' → freq[11]-- (twice)
'e' → freq[4]--
'h' → freq[7]--
After processing s2, all freq[i] should be 0 if the strings are anagrams.

✅ Check if anagram
for (int count : freq) {
    if (count != 0) {
        return false; // not an anagram
    }
}
return true; // anagram
If any count is not zero, it means s1 and s2 do not have the same letters.
This method is O(n) and faster than sorting (O(n log n)), especially for long strings.
 */