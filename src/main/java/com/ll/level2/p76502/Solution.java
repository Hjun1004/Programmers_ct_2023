package com.ll.level2.p76502;

import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = 0;

        int length = s.length();

        for(int j = 0 ; j < length ; j++){

            if(j != 0) s = shift(s);

            Stack<Character> stack = new Stack<>();

            for(int i = 0 ; i < length; i++){

                char nowChar = s.charAt(i);

                if(stack.isEmpty()){
                    stack.push(nowChar);
                    continue;
                }

                if(stack.peek().equals('(') && nowChar == ')'){
                    stack.pop();
                    continue;
                }
                else if(stack.peek().equals('{') && nowChar == '}'){
                    stack.pop();
                    continue;
                }
                else if(stack.peek().equals('[') && nowChar == ']'){
                    stack.pop();
                    continue;
                }

                stack.push(nowChar);

            }

            if(stack.isEmpty()) answer++;

        }

        return answer;
    }

    public String shift(String input){
        input = input.charAt(input.length() - 1) + input.substring(0, input.length()-1);

        return input;
    }
}
