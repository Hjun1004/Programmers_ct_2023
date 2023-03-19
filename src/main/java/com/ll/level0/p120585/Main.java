package com.ll.level0.p120585;

import java.util.Arrays;

public class Main {

}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        answer = (int) Arrays.stream(array)
                .filter(e -> e>height).count();
        return answer;
    }
}