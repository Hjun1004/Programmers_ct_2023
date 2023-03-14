package com.ll.level0.p120883;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

}
class Solution {
    public String solution(String[] id_pw, String[][] db) {

        for(String[] al : db){
            if(Arrays.deepToString(al).equals(Arrays.toString(id_pw))) return "login";
            else if(id_pw[0].equals(al[0])&& !id_pw[1].equals(al[1])) {
                return "wrong pw";
            }
        }
        return "fail";
    }
}