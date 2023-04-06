package com.ll.level0.p120813;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int n) {
        List<Integer> li = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++ ){
            if(i%2==1) li.add(i);
        }
        int[] answer = li.stream().mapToInt(e-> e).toArray();
        return answer;
    }
}