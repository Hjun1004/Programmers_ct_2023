package com.ll.level0.p120816;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int slice, int n) {
        int result = 1;

        for(;;){
            if(slice*result>=n) break;
            else result ++;
        }
        return result;
    }
}

