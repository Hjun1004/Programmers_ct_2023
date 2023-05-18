package com.ll.level1.p76501;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[] {4, 7, 12}, new boolean[] {true,false,true}));
    }
}

class Solution {
    public Long solution(int[] absolutes, boolean[] signs) {
        long result = 0L;
        for(int i = 0; i < signs.length ; i++){
            if(signs[i]) result += absolutes[i];
            else result -= absolutes[i];
        }
        return result;
    }
}