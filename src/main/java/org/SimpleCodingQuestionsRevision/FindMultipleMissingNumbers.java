package org.SimpleCodingQuestionsRevision;

import java.util.Arrays;
import java.util.HashSet;

public class FindMultipleMissingNumbers {
    public static void main(String[] args){
     int [] arr = {1, 2, 8};
     int n = Arrays.stream(arr).max().getAsInt();

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        System.out.println("Missing (HashSet):");
        for (int i = 1; i <= n; i++){
            if (!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
