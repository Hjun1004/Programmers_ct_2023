package com.ll.level2.p12900;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3 ; i <= n ; i++){
            dp[i] = dp[i-2] % 1000000007 + dp[i-1] % 1000000007;
        }


        return dp[n]%1000000007;
    }
}
