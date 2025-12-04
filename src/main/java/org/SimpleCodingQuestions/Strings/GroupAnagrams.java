package org.SimpleCodingQuestions.Strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}

/*
if (!map.containsKey(key)) {
    map.put(key, new ArrayList<>());
}
map.get(key).add(s);

That’s literally what computeIfAbsent does.
 */