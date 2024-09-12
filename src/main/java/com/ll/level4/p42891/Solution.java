package com.ll.level4.p42891;

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











        /*
        int lenth = food_times.length;
        int index = 0;

        Queue<Food> foodQueue = new LinkedList<>();


        for(int i = 0 ; i < lenth ; i++){
            foodQueue.add(new Food(i+1 , food_times[i]));
        }

        int queeuLenth = foodQueue.size();

        Food lastFood = null;

        while(k>=0) {
            Food food = foodQueue.poll();

            if(food.time!=0){
                food.time--;
                k--;
                foodQueue.add(food);
            }
            else if(food.time == 0){
                foodQueue.add(food);
            }

            if(k== -1L){
                lastFood = food;
            }

        }*/



        return 1;
    }
}


