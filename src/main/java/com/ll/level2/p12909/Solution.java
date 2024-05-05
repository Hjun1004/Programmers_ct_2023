package com.ll.level2.p12909;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;


        Stack<Character> stack = new Stack<>();

        if(s.charAt(0) == ')') answer = false;

        else{
            for(int i = 0 ; i < s.length() ; i++){
                if(stack.empty()) stack.push(s.charAt(i));
                else if(s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                }
                else if (s.charAt(i) == ')'){
                    stack.pop();
                }
            }

            if(stack.empty()) answer = true;
            else answer = false;
        }

        return answer;
    }
}
