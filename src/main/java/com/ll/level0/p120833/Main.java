package com.ll.level0.p120833;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {

    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> al = new ArrayList<>();
        for(int i = num1 ; i <= num2 ; i++ ){
            al.add(numbers[i]);
        }
        int[] a = al.stream().mapToInt(e -> e).toArray();
        return a;
    }
}