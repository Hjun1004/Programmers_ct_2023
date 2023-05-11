package com.ll.level1.p12903;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("qwer"));
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        if(s.length()%2 == 0){
            sb.append(s.charAt(s.length()/2 - 1));
            sb.append(s.charAt(s.length()/2));
        }
        else sb.append(s.charAt(s.length()/2));

        return sb.toString();
    }
}
