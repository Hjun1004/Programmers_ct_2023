package com.ll.level0.p181878;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //String a = "aaaa";
        //System.out.println(a.contains("aaaaa"));
        System.out.println(solution.solution("AbCdEfG","aBc"));
        System.out.println(solution.solution("aaAA","aaaaa"));
    }
}

class Solution {
    public int solution(String myString, String pat) {
        StringBuilder myStringNew = new StringBuilder();
        StringBuilder patNew = new StringBuilder();

        for (char a : myString.toCharArray()) {
            if (a >= 65 && a <= 90) a += 32;
            myStringNew.append(a);
        }

        for (char a : pat.toCharArray()) {
            if (a >= 65 && a <= 90) a += 32;
            patNew.append(a);
        }


        return myStringNew.toString().contains(patNew.toString()) ? 1 : 0;
    }
}
