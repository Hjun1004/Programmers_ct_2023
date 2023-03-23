package com.ll.level0.p120826;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
}

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = Arrays.stream(my_string.split(""))
                .filter(e-> !e.equals(letter))
                .collect(Collectors.joining(""));
        return answer;
    }
}