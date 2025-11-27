package org.SimpleCodingQuestionsRevision;

public class StringReversal {
    public static void main(String[] args){
        String input = "Hari";
        StringBuilder rev = new StringBuilder();

        for(int i = input.length()-1;i>=0; i--){
            rev.append(input.charAt(i));
        }
        System.out.println("Reversed string: "+rev);
    }
}
