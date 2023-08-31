package com.ll.level1.p142086;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        int count = 0;

        for(int i = 0 ; i < s.length() ; i++){
            String str = s.substring(0,i);


            char check = s.charAt(i);

            for(int j = 0 ; j < str.length(); j++){
                count = str.lastIndexOf(check);
            }

            if(i == 0){
                answer[0] = -1;
            }

            if(i != 0){
                if(count != -1){
                    answer[i] = i-count;
                }
                else{
                    answer[i] = count;
                }
            }

            count= 0;
        }

        return answer;
    }
}
