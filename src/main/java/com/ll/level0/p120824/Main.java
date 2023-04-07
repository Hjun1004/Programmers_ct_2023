package com.ll.level0.p120824;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int a : num_list){
            if(a%2 == 0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}