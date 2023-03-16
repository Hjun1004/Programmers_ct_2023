package com.ll.level0.p120822;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {

        String answer = new StringBuilder(my_string).reverse().toString();

        /*StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        String answer = sb.reverse().toString();*/

        return answer;
    }
}
