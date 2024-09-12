package com.ll.level4.p42891;

import java.util.*;

public class Solution {
    class Food{
        int index;
        int time;

        public Food(int index, int time) {
            this.index = index;
            this.time = time;
        }


    };

    public int solution(int[] food_times, long k) {
        int answer = 0;
        int foodLength = food_times.length;

        List<Food> foodList = new ArrayList<>();

        for(int i = 0 ; i < foodLength ; i++){
            foodList.add(new Food(i+1, food_times[i]));
        }

        Collections.sort(foodList, (a,b) -> a.time - b.time);

//        for(int i = 0 ; i < foodList.size() ; i++){
//            System.out.println(foodList.get(i).time);
//        }

        int idx = 0;
        int currentTime = 0;

        for(Food f : foodList){
            long diff = f.time - currentTime;

            if(diff != 0){
                long spend = diff * foodLength;

                if(spend <= k){
                    k-=spend;
                    currentTime = f.time;
                }
                else{
                    k%=foodLength;
                    List<Food> remainFoodList = new ArrayList<>(foodList.subList(idx, food_times.length));
                    Collections.sort(remainFoodList, (a,b) -> a.index - b.index);

                    for(int i = 0 ; i < remainFoodList.size(); i++){
                        System.out.println(remainFoodList.get(i).index);
                    }

                    return remainFoodList.get((int)k).index;
                }
            }
            foodLength--;
            idx++;
        }

        return -1;
    }
}


