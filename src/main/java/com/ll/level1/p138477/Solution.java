package com.ll.level1.p138477;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        ArrayList<Integer> sl = new ArrayList<>();

        for(int i = 0; i<score.length ; i++){
            sl.add(score[i]);
            Collections.sort(sl, Collections.reverseOrder());
            if(sl.size() > k){
                sl.remove(k);
            }
            answer[i] = Collections.min(sl);
        }

        return answer;
    }

}
