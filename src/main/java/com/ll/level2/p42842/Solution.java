package com.ll.level2.p42842;

import java.util.Stack;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int rowYellow = 0;
        int columnYellow = 0;

        Stack<Integer> stack = new Stack<>();

        // 약수를 스택에 저장한다.
        if(yellow==1){
            stack.push(1);
        }else{
            for(int i = 2; i <= Math.sqrt(yellow);i++){
                if(yellow%i == 0){
                    stack.push(i);
                }
            }
        }

        // 절반 이하 까지의 약수만 스택에 저장하기 때문에 2같은 경우나 소수는 스택에 숫자가 저장되지 않는다.
        // 그래서 스택이 비면 1을 넣는다.

        if(stack.empty()){
            stack.push(1);
        }

        // 처음으로 만든 사각형에서 예시로 전달된 갈색과 노란색의 합이
        // return 되기위한 사각형의 수와 일치하지 않으면 다른 사각형을 만들어 본다.
        if(!stack.empty()){
            while(brown+yellow != (rowYellow+2)*(columnYellow+2)){
                columnYellow = stack.pop();

                rowYellow = yellow/columnYellow;
            }
        }

        answer = new int[]{rowYellow + 2, columnYellow + 2};

        return answer;
    }
}
