package com.ll.level1.p176963;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};

        HashMap<String, Integer> map = new HashMap<>();

        List<Integer> sl = new ArrayList<>();

        for(int i = 0 ; i < name.length ; i++){
            map.put(name[i], yearning[i]);
        }


        for(int j = 0 ; j < photo.length ; j++){
            int sum = 0;

            for(String a : name){
                for(int i = 0 ; i < photo[j].length ; i++){

                    if(a.equals(photo[j][i])){
                        sum += map.get(a);
                    }

                }
            }

            sl.add(sum);
        }

        answer = sl.stream().mapToInt(e -> e.intValue()).toArray();

        return answer;
    }
}
