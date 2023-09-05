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
                if(s1.charAt(n) > s2.charAt(n)) return 1; // s1이 더 큼
                else if(s1.charAt(n) < s2.charAt(n)) return -1; // s2가 더 큼
                else return 0; // 둘 다 같음
            }
        });
        // Comparator 오버라이딩

        return strings;

    }
}
