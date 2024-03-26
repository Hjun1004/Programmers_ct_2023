package com.ll.level2.p12937;

import java.util.Stack;

public class Solution {
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length() ; i++){
            if(stack.empty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.peek().equals(s.charAt(i))){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }

        if(stack.empty()) return 1;
        else return 0;
    }
}
