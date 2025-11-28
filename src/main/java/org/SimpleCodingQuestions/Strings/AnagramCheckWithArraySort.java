package org.SimpleCodingQuestions.Strings;
import java.util.Arrays;
public class AnagramCheckWithArraySort {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)){
                System.out.println(s1 + " and " + s2 + " are anagrams.");
            } else {
                System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
            }
        }
    }
}
