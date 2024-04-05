package com.ll.level2.P138476;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // 귤 박스를 정렬한다.
        Arrays.sort(tangerine);


        int atomicCount = 0;
        int nowAtom = 0;

//        nowAtom = tangerine[0];

        // 같은 크기의 귤의 개수만 priorityQueue 에 저장한다.
        // 지금 priorityQueue 는 역순이라서 큰것들 부터 우선순위이다.
        if(tangerine.length == 1){
            priorityQueue.add(1);
        }else{
            for(int i = 0 ; i < tangerine.length ; i++){
                if(i == 0){
                    nowAtom = tangerine[i];
                    atomicCount++;
                    continue;
                }

                if(tangerine[i] == nowAtom){
                    atomicCount++;
                }

                if(tangerine[i] != nowAtom){
                    priorityQueue.add(atomicCount);

                    nowAtom = tangerine[i];
                    atomicCount = 1;
                }

                if(i == tangerine.length -1){
                    priorityQueue.add(atomicCount);
                }
            }
        }

//        System.out.println(priorityQueue.size());

        // priorityQueue 에서 poll 하면 귤의 개수들이 하나씩 나온다.
        // 귤의 개수가 많은거부터 하나씩 나오는데 그 숫자가 한 종류 귤의 개수이다.
        // 납품 해야하는 귤 수 k 에서 poll 한 값을 빼면서 카운트 한다.
        while(!priorityQueue.isEmpty()){
            int a = priorityQueue.poll();
            if(k-a > 0){
                k -= a;
                answer++;
            }else if(k-a <=0 ){
                answer++;
                break;
            }

        }

        return answer;
    }
}
