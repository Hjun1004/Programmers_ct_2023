package com.ll.level1.p1845;

import java.util.Arrays;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int[] new_nums = Arrays.stream(nums).distinct().toArray();

        System.out.println(Arrays.toString(new_nums));

        if(nums.length/2 >= new_nums.length){
            answer = new_nums.length;
        }
        else answer = nums.length/2;

        return answer;
    }
}
