package com.ll.level3.p43105;

public class Solution {

//    List<Integer> list = new ArrayList<>();

    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] temp = new int[triangle.length][triangle[triangle.length -1].length];

        temp[0][0] = triangle[0][0];

//        answer = tri(0, triangle, 0, 0);

        for(int i = 1 ; i < triangle.length ; i++){
            temp[i][0] = temp[i-1][0] + triangle[i][0];
            answer = Math.max(answer, temp[i][0]);

            temp[i][i] = temp[i-1][i-1] + triangle[i][i];
            answer = Math.max(answer, temp[i][i]);

            for(int j = 1 ; j < i ; j++){
                temp[i][j] = Math.max(temp[i - 1][j - 1], temp[i - 1][j]) + triangle[i][j];
                answer = Math.max(answer, temp[i][j]);
            }
        }

        return answer;
    }

    // 밑의 방식은 재귀로 푼건데 시간초과 발생
/*
    public int tri(int num, int[][] triangle, int row, int column){

        if(row == triangle.length){
            return num;
        }

        int start = triangle[row][column]; // 7 / triangle[0][0]

        int a = 0;
        int b = 0;

        a += tri(start + num, triangle, row + 1, column);
        System.out.println("a는 " + a);
        b += tri(start + num, triangle, row + 1, column + 1);
        System.out.println("b는 " + b);

        System.out.println("큰 수는 " + Math.max(a, b));

        return Math.max(a, b);
    }
*/

}


