package com.ll.level0.p120836;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int solution(int n) {

        List<Integer> al = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            if(n%i == 0) al.add(i);
        }

        return al.size();
    }
}
