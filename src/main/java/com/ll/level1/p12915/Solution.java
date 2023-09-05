package com.ll.level1.p12915;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings);

        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1; //
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });

        return strings;

    }
}
