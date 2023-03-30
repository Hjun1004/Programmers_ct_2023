package com.ll.level0.p120818;

public class Main {

}

class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price>=500000) return price-=price*0.2;
        else if(price>=300000) return price-=price*0.1;
        else if(price>=100000) return price-=price*0.05;
        else return price;
    }
}