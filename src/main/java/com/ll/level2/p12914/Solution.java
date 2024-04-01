package com.ll.level2.p12914;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static Map<Integer, Long> memo = new HashMap<>();

    public long solution(int n) {
        long answer = 0;

        answer = dfs(++n);

        answer = answer%1234567;

        System.out.println(answer);
        return answer;
    }

    private long dfs(int n) {
        if(n<=1){
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        long result = dfs(n-1) + dfs(n-2);
        result%=1234567;

        memo.put(n, result);


        return result;
    }
}
