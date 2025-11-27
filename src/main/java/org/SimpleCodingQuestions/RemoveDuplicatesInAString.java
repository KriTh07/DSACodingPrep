package org.SimpleCodingQuestions;

public class RemoveDuplicatesInAString {
    public static void main(String[] args){
        String str = "automation";
        String result = " ";

        for (int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(result.indexOf(c) == -1) result += c;
        }
        System.out.println("After removing duplicate chars:" +result);
    }
}
