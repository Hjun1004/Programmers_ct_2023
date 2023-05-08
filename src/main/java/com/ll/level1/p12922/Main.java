package com.ll.level1.p12922;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3));
    }
}

class Solution {
    public String solution(int n) {
        String su = "수";
        String subak = "수박";
        StringBuilder sb = new StringBuilder();

        if(n%2 == 0){
            for(int i = 0 ; i < n/2 ; i++){
                sb.append(subak);
            }
        }
        else if(n%2 == 1){
            for(int i = 0 ; i < n/2 ; i++){
                sb.append(subak);
            }
            sb.append(su);
        }

        return sb.toString();
    }
}
