package com.ll.level1.p12918;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1234"));
    }
}

class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0 ; i < s.length() ; i++){

                if(s.charAt(i) >= 65 && s.charAt(i) <= 90 ) return false;

                if(s.charAt(i) >= 97 && s.charAt(i) <= 122) return false;
            }

            return true;
        }
        return false;
    }
}
