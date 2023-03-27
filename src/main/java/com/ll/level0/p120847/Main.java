package com.ll.level0.p120847;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-2] * numbers[numbers.length-1];
    }
}