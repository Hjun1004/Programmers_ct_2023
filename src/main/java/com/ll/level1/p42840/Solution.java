package com.ll.level1.p42840;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        List<Integer> ans = new ArrayList<>();

        int[] score = new int[3];

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        for(int i = 0 ; i < answers.length; i++){
            if(answers[i] == first[i%first.length]) score[0]++;
            if(answers[i] == second[i%second.length]) score[1]++;
            if(answers[i] == third[i%third.length]) score[2]++;
        }


        int max_score = Arrays.stream(score).max().getAsInt();

        for(int i = 0 ; i < score.length ; i++){
            if(score[i] == max_score){
                ans.add(i+1);
            }
        }

        answer = ans.stream().mapToInt(e -> e).toArray();

        return answer;
    }
}
