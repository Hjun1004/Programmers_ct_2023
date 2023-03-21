package com.ll.level0.p120811;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int a = array.length/2;
        return array[a];
    }
}