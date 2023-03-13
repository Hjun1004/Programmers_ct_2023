package com.ll.level0.p120906;

public class Main {
    public static void main(String[] args) {

    }

}

class Solution {
    int sum;
    public int solution(int n) {
        //V1
        /*
        String nStr = n + "";

        for( int i = 0 ; i < nStr.length() ; i++){
            char c  = nStr.charAt(i);

            sum += Character.getNumericValue(c); // 문자 1은 아스키 코드값으로 49인데 아스키 코드값 말고 문자 1을 진짜 숫자 1로 나오게 해준다.
        }
        return sum;*/

        //V2
        return (n + "") // 123 => "123"
                .chars() //"123" => intStream[49, 50, 51]
                .map(e -> Character.getNumericValue(e)) //intStream[49, 50, 51] => intStream[1, 2, 3]
                .sum(); // 더한다.
    }

    public int solution2(int n) {
        return (n+"") // 123 => "123"
                .chars() //"123" => intStream[49, 50, 51]
                .map(Character::getNumericValue) //intStream[49, 50, 51] => intStream[1, 2, 3]
                .sum(); // 더한다.

    }

//    public int solution3(int n){
//        String nStr = Integer.toString(n);
//
//    }
}