package com.ll.level2.p42626;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        Arrays.stream(scoville).boxed().forEach(integer -> priorityQueue.add(integer));


        while((priorityQueue.peek() < K)){
            if(priorityQueue.size() < 2){
                answer = -1;
                break;
            }
            int min = priorityQueue.poll();
            int nextMin = priorityQueue.poll();

            priorityQueue.add(min + nextMin * 2);

            answer++;
        }


        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        return answer;
    }
}
