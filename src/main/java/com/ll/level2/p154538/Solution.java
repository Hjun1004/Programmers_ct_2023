package com.ll.level2.p154538;

public class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;

        int[] dp = new int[y+1];


        if(x%2 == 0 && n%2 == 0 && y%2==1){
            dp[y] = -1;

            return dp[y];
        }




        for(int i = x; i <= y ; i++){
            if(i != x && dp[i] == 0){
                dp[i] = -1;
                continue;
            }

            if( i + n <= y){
                dp[i + n] = (dp[i + n] == 0) ? dp[i] + 1 : Math.min(dp[i + n] , dp[i] + 1);
            }

            if( i * 2 <= y){
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 : Math.min(dp[i * 2] , dp[i] + 1);
            }

            if( i * 3 <= y){
                dp[i * 3] = (dp[i * 3] == 0) ? dp[i] + 1 : Math.min(dp[i * 3] , dp[i] + 1);
            }

        }

        return dp[y];
    }


}
