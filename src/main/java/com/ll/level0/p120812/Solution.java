package com.ll.level0.p120812;

import java.util.*;

public class Solution {
    public int solution(int[] array) {
        List<Integer> al = new ArrayList<>();
        Map<Integer,Integer> alMap = new HashMap<>();

        int answer = 0;
        int count = 0;
        int maxNum = 0;
        int maxCount = 0;
        int maxIndex = -1;


        for(int i = 0 ; i < array.length ; i++){
            count = 0;
            answer = array[i];
            for(int j = 0 ; j < array.length ; j++){
                if(array[j] == answer) count++;
            }
            if(!alMap.containsKey(answer)){
                alMap.put(answer,count);
            }
        }

        List<Integer> ala = new ArrayList<>(alMap.keySet()); // 1 2 3 4

        for(int i = 0 ; i < ala.size() ; i++){
            if(alMap.get(ala.get(i))>maxNum){
                maxIndex = i;
                maxNum = alMap.get(ala.get(i));
            }
        }

        for(int i = 0 ; i < ala.size() ; i++){
            if(maxNum == alMap.get(ala.get(i)) && ala.size()>1 ) maxCount++;
        }

        if(maxCount>=2) return -1;

        return ala.get(maxIndex);
    }
}
