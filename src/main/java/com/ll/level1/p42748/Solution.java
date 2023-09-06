package com.ll.level1.p42748;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length ; i++){
            int[] destArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            Arrays.sort(destArr);

            answer[i] = destArr[commands[i][2]-1];
        }
        return answer;
    }
}
