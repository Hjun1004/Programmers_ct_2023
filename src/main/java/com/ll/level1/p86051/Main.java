package com.ll.level1.p86051;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[] {1,2,3,4,6,7,8,0}));
        System.out.println(sol.solution(new int[] {5,8,4,0,6,7,9}));
    }
}

class Solution {
    public int solution(int[] numbers) {
        final int sumAll = 45;

        int sum = Arrays.stream(numbers).sum();

        return sumAll-sum;
    }
}