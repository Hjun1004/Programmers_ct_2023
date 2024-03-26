package com.ll.level2.p12939;

public class Solution {
    public String solution(String s) {
        String answer = "";

        String arr[] = s.split(" ");

        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for(int i = 1 ; i < arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        answer = min + " " + max;

//        System.out.println("min 은 " + min);
//        System.out.println("max 은 " + max);
//        System.out.println(num);

//        System.out.println(answer);

        return answer;
    }
}
