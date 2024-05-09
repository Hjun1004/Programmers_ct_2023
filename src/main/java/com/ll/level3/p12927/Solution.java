package com.ll.level3.p12927;

import java.util.Collections;
import java.util.PriorityQueue;

// 레벨 3 야근 지수 문제
public class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;

        // n 이 0이면 바로 작업량으로 계산
        if(n == 0){
            for(int i = 0 ; i < works.length ; i++){
                int num = works[i];
                answer += (long)num * num;
            }

            return answer;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < works.length ; i++){
            priorityQueue.add(works[i]);
        }


        // 우선순위 큐로 제일 앞에 정렬하고 앞에 숫자 poll 한 후 -1하고 다시 add (이 과정 중에 n을 1줄임)
        while(n > 0){
            if(priorityQueue.isEmpty()){
                break;
            }

            int a = priorityQueue.poll();

            a--;

            if(a == 0){
                n--;
            }else if(a > 0){
                n--;

                priorityQueue.add(a);
            }
        }


        int size = priorityQueue.size();

        // 야근시간 남았는데 일이 끝나는경우  ( n이 남아있는데 우선순위 큐 안에 숫자 다 없어지는 경우) answer = 0
        if(n > 0 && priorityQueue.isEmpty()){
            answer = 0;
        }
        else{
            for(int i = 0 ; i < size ; i++){
                int num = priorityQueue.poll().intValue();
                answer +=(long) num * num;
            }
        }


        return answer;
    }
}
