package com.ll.level1.p155652;

public class Solution {
    public String solution(String s, String skip, int index) {

        char[] s_CharArr = s.toCharArray(); // 이걸로 문자열을 char 배열에 집어넣을 수 있다.

        StringBuilder sb = new StringBuilder();

        for(char check : s_CharArr){

            char checkedS = check;

            for(int j = 0 ; j < index ; j++){
                checkedS += 1;

                if(checkedS > 122){
                    checkedS -=26;
                }

                if(skip.contains(String.valueOf(checkedS))){
                    j--;
                }
            }

            sb.append(checkedS);
        }

        return sb.toString();
    }
}
