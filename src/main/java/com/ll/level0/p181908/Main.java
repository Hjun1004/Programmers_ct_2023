package com.ll.level0.p181908;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("banana", "ana"));
    }
}

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> suffix = new ArrayList<>();

        findSuffix(my_string, suffix);

        for(String check : suffix){
            if(check.equals(is_suffix)) answer = 1;
        }
        return answer;
    }

    private void findSuffix(String myString, List<String> suffix) {
        suffix.add(myString);
        if(myString.length() == 1) return ;
        myString =  myString.substring(1);
        findSuffix(myString,suffix);
        return ;
    }
}
