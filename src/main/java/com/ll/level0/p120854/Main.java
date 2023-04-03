package com.ll.level0.p120854;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = Arrays.stream(strlist)
                .mapToInt(e->e.length())
                .toArray();
        return answer;
    }
}