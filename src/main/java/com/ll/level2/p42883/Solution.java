package com.ll.level2.p42883;

public class Solution {
    public String solution(String number, int k) {
        String answer = "";

        int start = 0;

        char max = '0';

        StringBuilder sb = new StringBuilder();

        char[] a = number.toCharArray();

        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }

        int len = number.length() - k;

        for(int i = 0 ; i < len ; i++){
            max = '0';

            for(int j = start ; j <= i + k ; j++){

                if(a[j] > max){
                    max = a[j];
                    start = j + 1;
                }

            }
            sb.append(max);
        }

        answer = sb.toString();

        return answer;
    }
}
