package org.SimpleCodingQuestions.Strings;

import java.util.HashMap;
import java.util.Map;

public class WordCountInSentence {
    public static void main(String[] args) {
        String sentence = "this is a test this is only a test";

        // Split by space
        String[] words = sentence.split(" ");

        // HashMap → word : frequency
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
    }
}
