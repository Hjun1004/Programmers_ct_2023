package com.ll.level1.p12947;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;

        String strNum = Integer.toString(x); // 숫자를 문자열로

        int[] arrNum = Stream.of(strNum.split("")).mapToInt(Integer::parseInt).toArray();

        for(int indexNum : arrNum){
            sum += indexNum;
        }

        if(x % sum == 0){
            return answer;
        }

        return !answer;
    }
}
