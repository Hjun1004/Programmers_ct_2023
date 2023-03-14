package com.ll.level0.p120883;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

}

class Solution {
    public String solution(String[] id_pw, String[][] db) {

        System.out.println(db[2][0]);
        System.out.println(db.length);

        System.out.println(Arrays.toString(id_pw));
        System.out.println(Arrays.deepToString(db[0]));

        for(String[] al : db){
            if(Arrays.deepToString(al).equals(Arrays.toString(id_pw))) return "login";
        }

        for(int i = 0 ; i < db.length ; i++){
            for(int j = 0 ; j < id_pw.length ; j++){
                if(id_pw[0] == db[i][0] && id_pw[1] != db[i][j]) return "wrong pw";
                /*else if (Arrays.toString(id_pw).equals(Arrays.deepToString(db[i]))) {
                    return "login";
                }*/
            }
        }
        return "fail";
    }
}