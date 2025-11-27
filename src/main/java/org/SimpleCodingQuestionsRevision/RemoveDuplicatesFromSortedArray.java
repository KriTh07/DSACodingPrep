package org.SimpleCodingQuestionsRevision;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int [] arr = {1, 2, 2, 3, 3, 4, 4, 5};
        int j = 0;

        for(int i = 0; i <arr.length; i++){
            if (arr[i] != arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        int unique = j+1;
        for (int i = 0; i<unique; i++){
            System.out.println(arr[i]);
        }
    }
}
