package com.ll.level1.p68644;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        List<Integer> sl = new ArrayList<>();

        for(int i = 0 ; i < numbers.length; i++){
            if(i != numbers.length-1){
                for(int j = i+1 ; j < numbers.length ; j++){
                    if(!sl.contains(numbers[i] + numbers[j])){
                        sl.add(numbers[i] + numbers[j]);
                    }
                }
            }
        }

        Collections.sort(sl);

        answer = sl.stream().mapToInt(e -> e).toArray();

        return answer;
    }
}
