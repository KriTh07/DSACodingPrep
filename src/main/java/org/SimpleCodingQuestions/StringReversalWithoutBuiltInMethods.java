package org.SimpleCodingQuestions;

public class StringReversalWithoutBuiltInMethods {
    public static void main(String[] args){
        String str = "Hari priya";
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() -1; i>=0;i--){
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
    }
}
/*
int i = str.length() - 1
str.length() gives the number of characters in the string.
Strings are 0-indexed, meaning the first character is at index 0.
So the last character is at index str.length() - 1.
Example: "Hari priya" → length = 10
Indices: H=0, a=1, r=2, i=3, space=4, p=5, r=6, i=7, y=8, a=9
Last index = 10-1 = 9 → 'a'

2️⃣ i >= 0
The loop continues as long as i is 0 or greater.
When i becomes -1, it stops.
This ensures we cover all characters from last to first.

3️⃣ i--
After each iteration, decrease i by 1.
Moves the loop backwards through the string.
 */