package com.ll.level2.p42584;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];
        int count = 0;
        int check = 0;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < prices.length ; i++){
            queue.add(prices[i]);
        }

        int price = 0;
        int time = 0;

        while(!queue.isEmpty()){
            time = 0;
            price = queue.poll();

            if(queue.isEmpty()){
                answer[count] = time;
            }

            Iterator<Integer> iterator = queue.iterator(); // 반복자 사용
            int compare = 0;

            while(iterator.hasNext()){
                compare = iterator.next();

                time++;

                if(price > compare){

                    break;
                }
            }

            answer[count] = time;

            count++;

        }

        /*
        for(int i = 0 ; i < prices.length ; i++){
            check = 0;
//            stack.push(prices[i]);
            queue.add(prices[i]);

            for(int j = i+1 ; j < prices.length ; j++){
//                if(stack.isEmpty()){
//                    stack.push(prices[j]);
//                }
                /*
                if(prices[j] > stack.peek()){
                    stack.push(prices[j]);
                }
                else if(prices[j] == stack.peek()){
                    stack.push(prices[j]);
                }
                else if(prices[j] < stack.peek()){
                    System.out.println(prices[i]);
                    System.out.println(stack.peek());

                    answer[count] = stack.size() + 1;
                    check = 1;
                }
                */

        /*
                if(prices[j] > queue.peek()){
                    queue.add(prices[j]);
                }
                else if(prices[j] == queue.peek()){
                    queue.add(prices[j]);
                }
                else if(prices[j] < queue.peek()){

                    answer[count] = queue.size();
                    check = 1;
                    break;
                }
            }
            if(check != 1){
//                answer[count] = stack.size();
                answer[count] = queue.size() - 1;
            }

            count++;

//            stack.clear();
            queue.clear();
        }*/


        return answer;
    }
}
