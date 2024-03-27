package com.ll.level2.p12980;

public class Solution {
    int count = 0;

    public int solution(int n) {
        int originalNum = n;


        while(n>=1){
            n /= 2;
            if(n%2 == 1){
                count++;
            }
        }

        if(originalNum%2 == 1){
            count++;
        }

        return count;
    }
}
