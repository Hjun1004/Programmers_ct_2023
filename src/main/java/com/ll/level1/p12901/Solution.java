package com.ll.level1.p12901;

import java.util.Arrays;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int calDays = 0;
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        for(int i = 0 ; i < a-1 ; i++){
            calDays += month[i];
        }

        calDays += b;

        answer = days[(calDays - 1) % 7];

        return answer;
    }
}
