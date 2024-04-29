package com.ll.level2.p17687;

public class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";

        String ch = "";

        System.out.println("start ch lenth = " + ch.length());

        int idx = 0;
        int order = p - 1;

        while(answer.length()!=t){
            ch += Integer.toString(idx, n);

            if(idx == order){
                answer += String.valueOf(Character.toUpperCase(ch.charAt(order)));

                order += m;
            }

            idx++;
        }

        return answer;
    }
}
