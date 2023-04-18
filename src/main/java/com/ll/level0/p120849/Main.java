package com.ll.level0.p120849;


import java.util.Arrays;

public class Main {
}

class Solution {
    public String solution(String my_string) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};

        for(String check : vowels){
            if(my_string.contains(check)) my_string = my_string.replaceAll(check,"");
        }

        return my_string;
    }
}
