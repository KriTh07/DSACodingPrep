package org.SimpleCodingQuestionsRevision;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SampleArrayProblem {
    public static void main(String[] args){
        int[] arr = { 3, 4, 2, 3, 1, 7, 9};
        Arrays.sort(arr);

        List <Integer> output = new ArrayList<>();

        for (int i =0; i<arr.length;i++){
            output.add(arr[i]);
        }
        System.out.println(output);
    }

}
