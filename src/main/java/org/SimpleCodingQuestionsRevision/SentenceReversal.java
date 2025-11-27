package org.SimpleCodingQuestionsRevision;

public class SentenceReversal {
    public static void main(String[] args){
        String input = "Hari Priya";
        StringBuilder rev = new StringBuilder();

        for(int i = input.length()-1; i>=0; i--){
            rev.append(input.charAt(i));
        }
        System.out.println(rev);
    }
}
