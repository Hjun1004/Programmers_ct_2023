package com.ll.level1.p82612;

public class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0;

        for(int i = 1 ; i <= count ; i++){
            totalCost += price * i;
        }

        long insufficientMoney = totalCost - money;

        if(insufficientMoney <= 0){
            return 0;
        }

        return insufficientMoney;
    }
}
