package org.SimpleCodingQuestions.Strings;

import java.util.Stack;

/**
 * Given a string containing only '(', ')', '{', '}', '[', ']', determine if the string is valid.
 * Valid means: Open brackets are closed by the same type of brackets
 * Open brackets are closed in the correct order
 */
public class ValidParentheses {
    public static void main(String[] args){
        String s = "({[]})";
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(stack.isEmpty());
    }

}



/*
Iterate over the string.
Push opening brackets into a stack.
For closing brackets, check if the stack top matches the type.
Stack must be empty at the end.
 */