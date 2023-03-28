package com.ll.level0.p120889;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] sides) {
        final int answer = Arrays.stream(sides)
                .max()
                .orElse(0);

        int sum = 0;
        int count = (int) Arrays.stream(sides).filter(e -> e == answer).count();

        if(count>2){
            sum=answer*3;
        }

        else if(count>1){
            for(int a : sides){
                if(a < answer) sum+=a;
            }
            sum+=answer;
        }

        else{
            for(int a : sides){
                if(a < answer) sum+=a;
            }
        }

        return answer < sum ? 1 : 2;
    }
}