package com.ll.level1.p135808;

import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        int count = 0;

        int min = Integer.MAX_VALUE;

        /* Integer로 래핑하고 정렬 후 다시 int로 변환
        Integer[] ad = Arrays.stream(score).boxed().toArray(Integer[]::new);

        Arrays.sort(ad, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2 - o1;
            }
        });

        System.out.println(Arrays.stream(ad).collect(Collectors.toList()));

        score = Arrays.stream(ad).mapToInt(e -> e).toArray();

        System.out.println(Arrays.toString(score));
        */

        score = Arrays.stream(score).boxed().sorted((i1, i2) -> i2 - i1).mapToInt(e -> e).toArray();
        // 위의 과정을 stream 한 줄로 변형

        for(int i = 0; i < score.length ; i++){
            count++;
            if(score[i] < min){
                min = score[i];
            }

            if(count%m == 0){
                answer+= m*min;
            }
        }

        return answer;
    }
}
