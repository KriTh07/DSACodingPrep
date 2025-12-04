package org.SimpleCodingQuestions.Strings;

import java.util.*;

public class GroupAnagramsSimplerVersion {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Step 1: sort each word to generate key
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // Step 2: check if key exists in map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Step 3: add the original string to its list
            map.get(key).add(s);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}

/*
sort the characters of each string.
Strings that become equal after sorting belong to the same anagram group.

I use a HashMap where the key is the sorted string, and the value is a list of original words.
 */
