package com.ll.level1.p77884;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(13, 17));
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Divisor> divisorList = new ArrayList<>();

        for(int i = left ; i <= right ; i++){
            divisorList.add(new Divisor(i));
        }

        for(Divisor chDivisor : divisorList){
            if(chDivisor.findDivisor() % 2 == 0){
                answer += chDivisor.num;
            }
            else{
                answer -= chDivisor.num;
            }
        }

        return answer;
    }
}

class Divisor{
    int num;
    int countDivisor = 0;

    public Divisor(int num) {
        this.num = num;
    }

    public int findDivisor(){
        for(int i = 1 ; i <= num ; i++ ){
            if(this.num % i == 0) countDivisor++;
        }
        return this.countDivisor;
    }
}
