package com.ll.level1.p12977;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        List<Integer> sl = new ArrayList<>();

        for(int i = 0 ; i <= nums.length - 3 ; i++){
            for(int j = i + 1 ; j <= nums.length-2 ; j++){
                for(int k = j + 1; k <= nums.length - 1; k++){
                    sl.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int[] prime_arr = sl.stream().mapToInt(e -> e).toArray();

        for(int ch : prime_arr){
            int check = 0;

            if(ch == 2){
                answer++;
            }

            for(int i = 2 ; i < ch ; i++){
                if(ch % i == 0){
                    check++;
                }
            }

            if(check == 0){
                answer++;
            }
        }

        return answer;
    }
}
