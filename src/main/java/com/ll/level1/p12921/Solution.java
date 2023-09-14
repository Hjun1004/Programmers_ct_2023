package com.ll.level1.p12921;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = n ; i>=2 ; i--){
            int check = 0;

            if(i == 2){
                answer++;
            }

            if(i == 3){
                answer++;
            }

            for(int j = 2 ; j <= Math.sqrt(i) ; j++){
                if(i % j == 0){
                    check++;
                    break;
                }
            }

            if(i > 3 && check == 0){
                answer++;
            }
        }

        return answer;

    }
}
