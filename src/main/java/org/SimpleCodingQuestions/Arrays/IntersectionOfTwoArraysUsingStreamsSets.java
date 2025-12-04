package org.SimpleCodingQuestions.Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysUsingStreamsSets {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4};
        int[] b = {2,2,4,6};

        Set<Integer> set1 = Arrays.stream(a).boxed().collect(Collectors.toSet());
        Set<Integer> intersection =
                Arrays.stream(b)
                        .boxed()
                        .filter(set1::contains)
                        .collect(Collectors.toSet());

        System.out.println(intersection); // [2, 4]
    }
}

