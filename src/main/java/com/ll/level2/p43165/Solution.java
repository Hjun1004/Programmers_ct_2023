package com.ll.level2.p43165;

public class Solution {

    public int solution(int[] numbers, int target) {
        int answer = 0;


        answer += dfs(numbers[0], 1, numbers, target);

        answer += dfs(numbers[0] * -1, 1, numbers, target);

        return answer;
    }

    int dfs(int curtData, int curIndex, int[] numbers, int target){
        System.out.println(curIndex);

        if(curIndex >= numbers.length){
            System.out.println("check");
            if(curtData == target){
                System.out.println("success");
                return 1;
            }
            return 0;
        }



        int routePlus = 0;
        int routeMinus = 0;

        routePlus = curtData + numbers[curIndex];
        routeMinus = curtData - numbers[curIndex];


        curIndex++;

        int ans = 0;

        ans += dfs(routePlus, curIndex, numbers, target);

        ans += dfs(routeMinus, curIndex, numbers, target);

//        System.out.println(ans);



        return ans;
    }
}
