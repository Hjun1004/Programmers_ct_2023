package com.ll.level2.p43165;

public class Solution {

    public int solution(int[] numbers, int target) {
        int answer = 0;

        final int numbersLength = numbers.length;

        boolean[] visited = new boolean[numbersLength];



        answer += dfs(numbers[0], 0,  visited, numbers, target);
        answer += dfs(numbers[0] * -1, 0,  visited, numbers, target);

        System.out.println(answer);

        return answer;
    }

    int dfs(int curtData, int curIndex, boolean[] visited, int[] numbers, int target){

        if(curIndex >= numbers.length){
            if(curtData == target){
                return 1;
            }
            return 0;
        }


//        if(visited[numbers.length -1]){
//            if(curtData == target){
//                return 1;
//            }
//
//            return 0;
//        }

//        visited[curIndex] = true;




        curIndex++;

        int routePlus = 0;
        int routeMinus = 0;

        if(curIndex < numbers.length){
            routePlus = curtData + numbers[curIndex];
            routeMinus = curtData - numbers[curIndex];
        }

        System.out.println(routePlus);
        System.out.println(routeMinus);

        int ans = 0;

        ans += dfs(routePlus, curIndex, visited, numbers, target);
        ans += dfs(routeMinus, curIndex, visited, numbers, target);

        return ans;
    }
}
