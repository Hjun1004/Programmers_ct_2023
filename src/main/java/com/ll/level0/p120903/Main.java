package com.ll.level0.p120903;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String str : s1){
            answer += (int)Arrays.stream(s2).filter(s->s.equals(str)).count();
        }
        return answer;
    }
}