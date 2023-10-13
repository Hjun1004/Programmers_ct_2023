package com.ll.level1.p86491;

public class Solution {
    public int solution(int[][] sizes) {
        int max_first = Integer.MIN_VALUE;
        int max_second = Integer.MIN_VALUE;

        for(int i = 0 ; i < sizes.length ; i++){
            if(sizes[i][0] >= sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if(sizes[i][0] > max_first) max_first = sizes[i][0];

            if(sizes[i][1] > max_second) max_second = sizes[i][1];

        }

        return max_first * max_second;
    }
}
