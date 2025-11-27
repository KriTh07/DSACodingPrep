package org.SimpleCodingQuestionsRevision;

import java.util.HashMap;

public class CountOfOccurenceOfCharsInAString {
    public static void main(String[] args){
        String str = "haripriya";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (char c : map.keySet()){
            System.out.println(c + "=" + map.get(c));
        }
    }
}
